package I7;

import n1.AbstractC1149a;
import u6.AbstractC1638C;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f2227a;

    /* JADX WARN: Type inference failed for: r0v0, types: [I7.d, java.lang.Object] */
    static {
        ?? obj = new Object();
        if (!AbstractC1638C.d("  ") && !AbstractC1638C.d("") && !AbstractC1638C.d("")) {
            AbstractC1638C.d("");
        }
        f2227a = obj;
    }

    public final void a(String str, StringBuilder sb) {
        sb.append(str);
        sb.append("bytesPerLine = ");
        sb.append(Integer.MAX_VALUE);
        sb.append(",");
        sb.append('\n');
        sb.append(str);
        sb.append("bytesPerGroup = ");
        sb.append(Integer.MAX_VALUE);
        sb.append(",");
        sb.append('\n');
        sb.append(str);
        sb.append("groupSeparator = \"");
        sb.append("  ");
        sb.append("\",");
        sb.append('\n');
        sb.append(str);
        sb.append("byteSeparator = \"");
        sb.append("");
        sb.append("\",");
        sb.append('\n');
        AbstractC1149a.m(sb, str, "bytePrefix = \"", "", "\",");
        sb.append('\n');
        sb.append(str);
        sb.append("byteSuffix = \"");
        sb.append("");
        sb.append("\"");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BytesHexFormat(\n");
        a("    ", sb);
        sb.append('\n');
        sb.append(")");
        return sb.toString();
    }
}
