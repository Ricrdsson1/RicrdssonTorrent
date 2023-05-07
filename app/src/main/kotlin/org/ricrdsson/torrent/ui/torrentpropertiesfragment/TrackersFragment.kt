// SPDX-FileCopyrightText: 2017-2022 Alexey Rochev <equeim@gmail.com>
//
// SPDX-License-Identifier: GPL-3.0-or-later

package org.ricrdsson.torrent.ui.torrentpropertiesfragment

import android.os.Bundle
import android.view.View
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import org.ricrdsson.torrent.R
import org.ricrdsson.torrent.databinding.TrackersFragmentBinding
import org.ricrdsson.torrent.torrentfile.rpc.Torrent
import org.ricrdsson.torrent.ui.navController
import org.ricrdsson.torrent.ui.utils.launchAndCollectWhenStarted
import org.ricrdsson.torrent.ui.utils.viewLifecycleObject


class TrackersFragment : TorrentPropertiesFragment.PagerFragment(R.layout.trackers_fragment, TorrentPropertiesFragment.PagerAdapter.Tab.Trackers) {
    private val torrentPropertiesFragment: TorrentPropertiesFragment
        get() = requireParentFragment() as TorrentPropertiesFragment

    private val binding by viewLifecycleObject(TrackersFragmentBinding::bind)
    private val trackersAdapter by viewLifecycleObject { TrackersAdapter(this) }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)

        binding.trackersView.apply {
            adapter = trackersAdapter
            layoutManager = LinearLayoutManager(activity)
            addItemDecoration(DividerItemDecoration(requireContext(), DividerItemDecoration.VERTICAL))
            (itemAnimator as DefaultItemAnimator).supportsChangeAnimations = false

            addOnScrollListener(object : RecyclerView.OnScrollListener() {
                override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                    torrentPropertiesFragment.binding.fab.apply {
                        if (dy > 0) {
                            hide()
                        } else if (dy < 0) {
                            show()
                        }
                    }
                }
            })
        }

        val propertiesFragmentModel = TorrentPropertiesFragmentViewModel.get(navController)
        propertiesFragmentModel.torrent.launchAndCollectWhenStarted(viewLifecycleOwner, ::update)
    }

    private suspend fun update(torrent: Torrent?) {
        trackersAdapter.update(torrent)
        binding.placeholder.visibility = if ((trackersAdapter.itemCount == 0) && torrent != null) {
            View.VISIBLE
        } else {
            View.GONE
        }
    }
}
