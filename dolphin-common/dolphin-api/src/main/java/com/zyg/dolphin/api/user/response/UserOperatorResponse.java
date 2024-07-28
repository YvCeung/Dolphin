package com.zyg.dolphin.api.user.response;

import com.zyg.dolphin.api.user.response.data.UserInfo;
import com.zyg.dolphin.base.response.BaseResponse;
import lombok.Getter;
import lombok.Setter;

/**
 * 用户操作响应
 *
 * @author Hollis
 */
@Getter
@Setter
public class UserOperatorResponse extends BaseResponse {

    private UserInfo user;
}
