package com.ledger.entity.res;

import com.ledger.utils.res.ResUtils;
import lombok.Data;

@Data
public class SessionInfo {
    private String url="/sessionInfo";
    private String sessionKey;

    public SessionInfo() {
        this.sessionKey= ResUtils.config.getSessionKey();
    }
}
