package K2;

import android.text.InputFilter;
import android.text.Spanned;
import o6.v;
import o6.w;
import u6.InterfaceC1642c;

/* loaded from: classes.dex */
public final class j implements InputFilter {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1642c f2630a;

    public j(InterfaceC1642c interfaceC1642c) {
        o6.j.e(interfaceC1642c, "type");
        this.f2630a = interfaceC1642c;
    }

    public final boolean a(String str) {
        try {
            InterfaceC1642c interfaceC1642c = this.f2630a;
            Class cls = Byte.TYPE;
            w wVar = v.f13643a;
            if (o6.j.a(interfaceC1642c, wVar.b(cls))) {
                long parseLong = Long.parseLong(str);
                if (-128 <= parseLong && parseLong <= 127) {
                    return true;
                }
                return false;
            }
            if (o6.j.a(interfaceC1642c, wVar.b(Short.TYPE))) {
                long parseLong2 = Long.parseLong(str);
                if (-32768 <= parseLong2 && parseLong2 <= 32767) {
                    return true;
                }
                return false;
            }
            if (o6.j.a(interfaceC1642c, wVar.b(Integer.TYPE))) {
                long parseLong3 = Long.parseLong(str);
                if (-2147483648L <= parseLong3 && parseLong3 <= 2147483647L) {
                    return true;
                }
                return false;
            }
            if (o6.j.a(interfaceC1642c, wVar.b(Long.TYPE))) {
                long parseLong4 = Long.parseLong(str);
                if (Long.MIN_VALUE <= parseLong4 && parseLong4 <= Long.MAX_VALUE) {
                    return true;
                }
                return false;
            }
            if (o6.j.a(interfaceC1642c, wVar.b(Float.TYPE))) {
                double parseDouble = Double.parseDouble(str);
                if (-3.4028234663852886E38d <= parseDouble && parseDouble <= 3.4028234663852886E38d) {
                    return true;
                }
                return false;
            }
            if (o6.j.a(interfaceC1642c, wVar.b(Double.TYPE))) {
                double parseDouble2 = Double.parseDouble(str);
                if (-1.7976931348623157E308d <= parseDouble2 && parseDouble2 <= Double.MAX_VALUE) {
                    return true;
                }
                return false;
            }
            throw new IllegalArgumentException("Invalid type.");
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i4, int i8, Spanned spanned, int i9, int i10) {
        o6.j.b(spanned);
        CharSequence subSequence = spanned.subSequence(0, i9);
        o6.j.b(charSequence);
        CharSequence subSequence2 = charSequence.subSequence(i4, i8);
        CharSequence subSequence3 = spanned.subSequence(i10, spanned.length());
        StringBuilder sb = new StringBuilder();
        sb.append((Object) subSequence);
        sb.append((Object) subSequence2);
        sb.append((Object) subSequence3);
        String sb2 = sb.toString();
        try {
            if (!o6.j.a(sb2, "-")) {
                if (a(sb2)) {
                    return null;
                }
                return "";
            }
            return null;
        } catch (NumberFormatException unused) {
            return "";
        }
    }
}
