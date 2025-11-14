package L;

import android.os.LocaleList;
import java.util.Locale;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public static final d f2742b = new d(new e(new LocaleList(new Locale[0])));

    /* renamed from: a, reason: collision with root package name */
    public final e f2743a;

    public d(e eVar) {
        this.f2743a = eVar;
    }

    public static d a(String str) {
        if (str != null && !str.isEmpty()) {
            String[] split = str.split(",", -1);
            int length = split.length;
            Locale[] localeArr = new Locale[length];
            for (int i4 = 0; i4 < length; i4++) {
                String str2 = split[i4];
                int i8 = c.f2741a;
                localeArr[i4] = Locale.forLanguageTag(str2);
            }
            return new d(new e(new LocaleList(localeArr)));
        }
        return f2742b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            if (this.f2743a.equals(((d) obj).f2743a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f2743a.f2744a.hashCode();
    }

    public final String toString() {
        return this.f2743a.f2744a.toString();
    }
}
