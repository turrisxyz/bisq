/*
 * This file is part of bisq.
 *
 * bisq is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or (at
 * your option) any later version.
 *
 * bisq is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU Affero General Public
 * License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with bisq. If not, see <http://www.gnu.org/licenses/>.
 */

package io.bisq.core.dao.blockchain.json;

import io.bisq.common.app.Version;
import lombok.Data;
import lombok.Setter;

@Data
public class TxOutputForJson {
    private final String txVersion = Version.BSQ_TX_VERSION;
    private final String txId;
    private final int outputIndex;
    private final long bsqAmount;
    private final long btcAmount;
    private final int height;
    private final boolean isVerified;
    private final long burntFee;
    private final ScriptPubKeyForJson scriptPubKey;
    private final SpentInfoForJson spentInfo;
    private final long time;
    @Setter
    private String txType;

    public String getId() {
        return txId + ":" + outputIndex;
    }
}
