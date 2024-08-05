package com.zyg.dolphin.datasource.sharding.id;

/**
 * @author zy
 */
public enum BusinessCode {
    /**
     * 订单
     */
    TRADE_ORDER(10, 4);

    private static final int MAX_CODE = 99;

    private static final int MIN_CODE = 10;

    private int code;

    private int tableCount;

    BusinessCode(int code, int tableCount) {
        if (code > MAX_CODE || code < MIN_CODE) {
            throw new UnsupportedOperationException("unsupport code : " + code);
        }
        this.code = code;
        this.tableCount = tableCount;
    }

    public int tableCount() {
        return tableCount;
    }

    public int code() {
        return code;
    }

    public String getCodeString() {
        return String.valueOf(this.code);
    }
}
