package cc.saferoad.cve202222978;

import org.junit.jupiter.api.Test;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.security.web.util.matcher.RegexRequestMatcher;
import static org.assertj.core.api.Assertions.assertThat;

public class RegexRequestMatcherTests {

    @Test
    public void matchesWithLineFeed() {
        RegexRequestMatcher matcher = new RegexRequestMatcher(".*", null);
        MockHttpServletRequest request = new MockHttpServletRequest("GET", "/blah%0d");
        request.setServletPath("/blah\r");
        assertThat(matcher.matches(request)).isTrue();
    }
}
