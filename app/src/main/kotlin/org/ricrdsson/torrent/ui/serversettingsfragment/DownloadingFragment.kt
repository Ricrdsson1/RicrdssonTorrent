// SPDX-FileCopyrightText: 2017-2022 Alexey Rochev <equeim@gmail.com>
//
// SPDX-License-Identifier: GPL-3.0-or-later

package org.ricrdsson.torrent.ui.serversettingsfragment

import android.os.Bundle
import org.ricrdsson.torrent.R
import org.ricrdsson.torrent.databinding.ServerSettingsDownloadingFragmentBinding
import org.ricrdsson.torrent.rpc.GlobalRpc
import org.ricrdsson.torrent.ui.utils.doAfterTextChangedAndNotEmpty
import org.ricrdsson.torrent.ui.utils.normalizePath
import org.ricrdsson.torrent.ui.utils.setDependentViews
import org.ricrdsson.torrent.ui.utils.toNativeSeparators


class DownloadingFragment : ServerSettingsFragment.BaseFragment(
    R.layout.server_settings_downloading_fragment,
    R.string.server_settings_downloading
) {
    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        with(ServerSettingsDownloadingFragmentBinding.bind(requireView())) {
            downloadDirectoryEdit.setText(GlobalRpc.serverSettings.downloadDirectory.toNativeSeparators())
            downloadDirectoryEdit.doAfterTextChangedAndNotEmpty {
                GlobalRpc.serverSettings.downloadDirectory = it.toString().normalizePath()
            }

            startTorrentsCheckBox.isChecked = GlobalRpc.serverSettings.startAddedTorrents
            startTorrentsCheckBox.setOnCheckedChangeListener { _, checked ->
                GlobalRpc.serverSettings.startAddedTorrents = checked
            }

            renameIncompleteFilesCheckBox.isChecked = GlobalRpc.serverSettings.renameIncompleteFiles
            renameIncompleteFilesCheckBox.setOnCheckedChangeListener { _, checked ->
                GlobalRpc.serverSettings.renameIncompleteFiles = checked
            }

            incompleteFilesDirectoryCheckBox.isChecked =
                GlobalRpc.serverSettings.incompleteDirectoryEnabled
            incompleteFilesDirectoryCheckBox.setDependentViews(incompleteFilesDirectoryLayout) { checked ->
                GlobalRpc.serverSettings.incompleteDirectoryEnabled = checked
            }

            incompleteFilesDirectoryEdit.setText(GlobalRpc.serverSettings.incompleteDirectory.toNativeSeparators())
            incompleteFilesDirectoryEdit.doAfterTextChangedAndNotEmpty {
                GlobalRpc.serverSettings.incompleteDirectory = it.toString().normalizePath()
            }
        }
    }
}