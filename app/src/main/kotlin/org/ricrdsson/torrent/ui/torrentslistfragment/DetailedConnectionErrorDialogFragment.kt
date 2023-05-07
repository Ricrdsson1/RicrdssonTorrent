// SPDX-FileCopyrightText: 2017-2022 Alexey Rochev <equeim@gmail.com>
//
// SPDX-License-Identifier: GPL-3.0-or-later

package org.ricrdsson.torrent.ui.torrentslistfragment

import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import org.ricrdsson.torrent.R
import org.ricrdsson.torrent.databinding.DetailedConnectionErrorDialogBinding
import org.ricrdsson.torrent.rpc.GlobalRpc
import org.ricrdsson.torrent.ui.NavigationDialogFragment
import org.ricrdsson.torrent.ui.utils.Utils

class DetailedConnectionErrorDialogFragment : NavigationDialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val builder = MaterialAlertDialogBuilder(requireContext())
        val binding = DetailedConnectionErrorDialogBinding.inflate(LayoutInflater.from(builder.context))
        binding.text.text = GlobalRpc.error.value.detailedErrorMessage
        return builder.setView(binding.root)
            .setTitle(R.string.detailed_error_message)
            .setNeutralButton(R.string.share) { _, _ -> Utils.shareText(binding.text.text, requireContext().getText(R.string.share), requireContext()) }
            .setNegativeButton(R.string.close, null).create()
    }
}
