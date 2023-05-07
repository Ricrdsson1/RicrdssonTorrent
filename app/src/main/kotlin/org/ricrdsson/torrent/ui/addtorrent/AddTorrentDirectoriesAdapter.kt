// SPDX-FileCopyrightText: 2017-2022 Alexey Rochev <equeim@gmail.com>
//
// SPDX-License-Identifier: GPL-3.0-or-later

package org.ricrdsson.torrent.ui.addtorrent

import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.launch
import org.ricrdsson.torrent.R
import org.ricrdsson.torrent.common.AlphanumericComparator
import org.ricrdsson.torrent.rpc.GlobalRpc
import org.ricrdsson.torrent.rpc.GlobalServers
import org.ricrdsson.torrent.ui.utils.BaseDropdownAdapter
import org.ricrdsson.torrent.ui.utils.normalizePath
import org.ricrdsson.torrent.ui.utils.toNativeSeparators


class AddTorrentDirectoriesAdapter(
    private val textEdit: EditText,
    coroutineScope: CoroutineScope,
    savedInstanceState: Bundle?
) : BaseDropdownAdapter(
    R.layout.download_directory_dropdown_item,
    android.R.id.text1
) {
    companion object {
        private const val STATE_KEY =
            "org.ricrdsson.torrent.ui.addtorrent.AddTorrentDirectoriesAdapter.items"
    }

    private var items = ArrayList<String>()

    init {
        val saved = savedInstanceState?.getStringArrayList(STATE_KEY)
        if (saved != null) {
            items = saved
        } else {
            coroutineScope.launch {
                // Wait until we are connected
                GlobalRpc.isConnected.first { it }

                val directories = sortedSetOf(AlphanumericComparator())
                GlobalServers.serversState.value.currentServer?.lastDownloadDirectories
                    ?.mapTo(directories) { it.normalizePath().toNativeSeparators() }
                GlobalRpc.torrents.value.mapTo(directories) { it.downloadDirectory.toNativeSeparators() }
                directories.add(GlobalRpc.serverSettings.downloadDirectory.toNativeSeparators())
                items = ArrayList(directories)
                notifyDataSetChanged()
            }
        }
    }

    override fun getCount() = items.size
    override fun getItem(position: Int) = items[position]

    override fun createViewHolder(view: View): BaseViewHolder = ViewHolder(view)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = super.getView(position, convertView, parent)
        (view.tag as ViewHolder).position = position
        return view
    }

    fun remove(position: Int) {
        items.removeAt(position)
        notifyDataSetChanged()
    }

    fun save() {
        val directories = items.mapTo(ArrayList(items.size)) { it.normalizePath() }
        val editPath = textEdit.text.toString().normalizePath()
        if (!directories.contains(editPath)) {
            directories.add(editPath)
        }
        GlobalServers.serversState.value.currentServer?.let { current ->
            if (current.lastDownloadDirectories != directories || current.lastDownloadDirectory != editPath) {
                GlobalServers.addOrReplaceServer(
                    current.copy(
                        lastDownloadDirectories = directories,
                        lastDownloadDirectory = editPath
                    )
                )
            }
        }
    }

    fun saveInstanceState(outState: Bundle) {
        outState.putStringArrayList(STATE_KEY, items)
    }

    private inner class ViewHolder(view: View) : BaseViewHolder(view) {
        var position = -1

        init {
            view.findViewById<View>(R.id.remove_button).setOnClickListener {
                if (count > 1) {
                    remove(position)
                }
            }
        }
    }
}
