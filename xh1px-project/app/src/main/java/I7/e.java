package I7;

import n1.AbstractC1149a;
import u6.AbstractC1638C;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public static final e f2228b = new e();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2229a = true;

    public e() {
        if (!AbstractC1638C.d("")) {
            AbstractC1638C.d("");
        }
    }

    public final void a(String str, StringBuilder sb) {
        AbstractC1149a.m(sb, str, "prefix = \"", "", "\",");
        sb.append('\n');
        sb.append(str);
        sb.append("suffix = \"");
        sb.append("");
        sb.append("\",");
        sb.append('\n');
        sb.append(str);
        sb.append("removeLeadingZeros = ");
        sb.append(false);
        sb.append(',');
        sb.append('\n');
        sb.append(str);
        sb.append("minLength = ");
        sb.append(1);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NumberHexFormat(\n");
        a("    ", sb);
        sb.append('\n');
        sb.append(")");
        return sb.toString();
    }
}
