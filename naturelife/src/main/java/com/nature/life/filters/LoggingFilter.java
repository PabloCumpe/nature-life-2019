package com.nature.life.filters;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.filter.AbstractRequestLoggingFilter;

import javax.servlet.http.HttpServletRequest;
import java.util.regex.Pattern;

public class LoggingFilter extends AbstractRequestLoggingFilter {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingFilter.class);

    private static final Pattern CLEAN_SPACES_PATTERN = Pattern.compile("\\s+(?=([^\"]*\"[^\"]*\")*[^\"]*$)");



    public LoggingFilter() {
        this.setMaxPayloadLength(2048);
        this.setIncludeQueryString(true);
        this.setIncludeHeaders(true);
        this.setIncludePayload(true);
    }

    @Override
    protected void beforeRequest(HttpServletRequest httpServletRequest, String s) {
        //
    }

    @Override
    protected boolean shouldLog(HttpServletRequest request) {
        return true;
    }

    @Override
    protected void afterRequest(HttpServletRequest httpServletRequest, String s) {
        if(isStatiContent(httpServletRequest)){
            return;
        }
        LOGGER.info(s);
    }

    @Override
    protected String createMessage(HttpServletRequest request, String prefix, String suffix) {
        StringBuilder msg = new StringBuilder();
        msg.append(prefix);
        msg.append(cleanTabsAndWhitespaces(super.createMessage(request, "", "")));
        msg.append(suffix);
        return msg.toString();
    }

    private boolean isStatiContent(HttpServletRequest request){
        return request.getContextPath().contains(".js") ||
                request.getContextPath().contains(".html") ||
                request.getContextPath().contains(".css");
    }

    private String cleanTabsAndWhitespaces(String text) {
        return CLEAN_SPACES_PATTERN.matcher(text).replaceAll("");
    }
}
