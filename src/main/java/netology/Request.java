package netology;

import org.apache.http.NameValuePair;

import java.util.List;
import java.util.Map;

public class Request {
    private final String method;
    private final String path;
    private final String version;
    private final List<NameValuePair> queryParams;
    private final Map<String, String> headers;

    public Request(String method, String path, String version, List<NameValuePair> queryParams, Map<String, String> headers) {
        this.method = method;
        this.path = path;
        this.version = version;
        this.queryParams = queryParams;
        this.headers = headers;
    }

    public String getMethod() {
        return method;
    }

    public String getPath() {
        return path;
    }

    public String getVersion() {
        return version;
    }

    public List<NameValuePair> getQueryParams() {
        return queryParams;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public String getQueryParam(String name) {
        for (NameValuePair param : queryParams) {
            if (param.getName().equals(name)) {
                return param.getValue();
            }
        }
        return null;
    }
}
