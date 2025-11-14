package k7;

import C6.A;
import java.util.Arrays;
import w7.AbstractC1759v;

/* loaded from: classes.dex */
public final class e extends o {
    @Override // k7.g
    public final AbstractC1759v a(A a3) {
        o6.j.e(a3, "module");
        z6.h o7 = a3.o();
        o7.getClass();
        return o7.t(z6.j.j);
    }

    @Override // k7.g
    public final String toString() {
        String str;
        Object obj = this.f12144a;
        Integer valueOf = Integer.valueOf(((Character) obj).charValue());
        char charValue = ((Character) obj).charValue();
        switch (charValue) {
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                str = "\\b";
                break;
            case '\t':
                str = "\\t";
                break;
            case '\n':
                str = "\\n";
                break;
            case 11:
            default:
                byte type = (byte) Character.getType(charValue);
                if (type != 0 && type != 13 && type != 14 && type != 15 && type != 16 && type != 18 && type != 19) {
                    str = String.valueOf(charValue);
                    break;
                } else {
                    str = "?";
                    break;
                }
            case '\f':
                str = "\\f";
                break;
            case '\r':
                str = "\\r";
                break;
        }
        return String.format("\\u%04X ('%s')", Arrays.copyOf(new Object[]{valueOf, str}, 2));
    }
}
