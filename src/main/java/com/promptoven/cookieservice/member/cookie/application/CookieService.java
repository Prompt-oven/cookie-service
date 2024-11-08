package com.promptoven.cookieservice.member.cookie.application;

import com.promptoven.cookieservice.global.common.CursorPage;
import com.promptoven.cookieservice.member.cookie.dto.in.CookieCreateRequestDto;
import com.promptoven.cookieservice.member.cookie.dto.in.CookieGetRequestDto;
import com.promptoven.cookieservice.member.cookie.dto.out.CookieGetResponseDto;

public interface CookieService {
    void createCookie(CookieCreateRequestDto requestDto);

    CursorPage<CookieGetResponseDto> getCookiesByMemberUuid(CookieGetRequestDto requestDto);

}
