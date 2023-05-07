// SPDX-FileCopyrightText: 2017-2022 Alexey Rochev <equeim@gmail.com>
//
// SPDX-License-Identifier: GPL-3.0-or-later

package org.ricrdsson.torrent.ui.torrentslistfragment

import android.widget.AutoCompleteTextView
import org.ricrdsson.torrent.torrentfile.rpc.Server
import org.ricrdsson.torrent.rpc.GlobalServers
import org.ricrdsson.torrent.common.AlphanumericComparator
import org.ricrdsson.torrent.ui.utils.AutoCompleteTextViewDynamicAdapter
import java.util.Comparator


class ServersViewAdapter(textView: AutoCompleteTextView) :
    AutoCompleteTextViewDynamicAdapter(textView) {
    lateinit var servers: List<Server>
        private set

    private val comparator = object : Comparator<Server> {
        private val nameComparator = AlphanumericComparator()
        override fun compare(o1: Server, o2: Server) = nameComparator.compare(o1.name, o2.name)
    }

    override fun getItem(position: Int) = servers[position].name

    override fun getCount() = servers.size

    override fun getCurrentItem(): CharSequence {
        return GlobalServers.serversState.value.currentServerName ?: ""
    }

    fun update() {
        servers = GlobalServers.serversState.value.servers.sortedWith(comparator)
        notifyDataSetChanged()
    }
}