package I7;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f2219a;

    static {
        Charset forName = Charset.forName("UTF-8");
        o6.j.d(forName, "forName(...)");
        f2219a = forName;
        o6.j.d(Charset.forName("UTF-16"), "forName(...)");
        o6.j.d(Charset.forName("UTF-16BE"), "forName(...)");
        o6.j.d(Charset.forName("UTF-16LE"), "forName(...)");
        o6.j.d(Charset.forName("US-ASCII"), "forName(...)");
        o6.j.d(Charset.forName("ISO-8859-1"), "forName(...)");
    }
}
