// SPDX-FileCopyrightText: 2017-2022 Alexey Rochev <equeim@gmail.com>
//
// SPDX-License-Identifier: GPL-3.0-or-later

package org.ricrdsson.torrent.torrentfile

import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.TestDispatcher
import org.ricrdsson.torrent.common.TremotesfDispatchers

@OptIn(ExperimentalCoroutinesApi::class)
class TestDispatchers constructor(dispatcher: TestDispatcher) : TremotesfDispatchers {
    override val Default = dispatcher
    override val IO = dispatcher
    override val Main = dispatcher
    override val Unconfined = dispatcher
}
