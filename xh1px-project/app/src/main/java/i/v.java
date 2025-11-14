package i;

import android.content.res.Configuration;
import android.os.LocaleList;

/* loaded from: classes.dex */
public abstract class v {
    public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (!locales.equals(locales2)) {
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }
    }

    public static L.d b(Configuration configuration) {
        return L.d.a(configuration.getLocales().toLanguageTags());
    }

    public static void c(L.d dVar) {
        LocaleList.setDefault(LocaleList.forLanguageTags(dVar.f2743a.f2744a.toLanguageTags()));
    }

    public static void d(Configuration configuration, L.d dVar) {
        configuration.setLocales(LocaleList.forLanguageTags(dVar.f2743a.f2744a.toLanguageTags()));
    }
}
