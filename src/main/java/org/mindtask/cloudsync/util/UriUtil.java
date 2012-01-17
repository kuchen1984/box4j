package org.mindtask.cloudsync.util;

import org.apache.commons.codec.net.URLCodec;
import org.apache.commons.httpclient.util.EncodingUtil;

/**
 * DOCME
 * 
 * @author tanxu
 * @date Jan 18, 2012
 * @since
 */
public abstract class UriUtil {

	public static String encodeParam(String url) {
		int firstQueryIdx = url.indexOf('?');
		if (firstQueryIdx <= 0)
			return url;
		
		StringBuilder builder = new StringBuilder();
		builder.append(url.substring(0, firstQueryIdx));
		builder.append('?');

		String query = url.substring(firstQueryIdx + 1);
		String[] queries = query.split("&");
		for (String q : queries) {
			int idx = q.indexOf('=');
			if (idx > 0) {
				String param = q.substring(0, idx);
				String value = q.substring(idx + 1);
				builder.append(
						EncodingUtil.getAsciiString(URLCodec.encodeUrl(null, EncodingUtil.getBytes(param, "UTF-8"))));
				builder.append('=');
				builder.append(
						EncodingUtil.getAsciiString(URLCodec.encodeUrl(null, EncodingUtil.getBytes(value, "UTF-8"))));
				builder.append('&');
			}
		}
		if (builder.charAt(builder.length() - 1) == '&')
			builder.deleteCharAt(builder.length() - 1);

		return builder.toString();
	}
}
