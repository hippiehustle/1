package I7;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class k implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final Pattern f2244d;

    public k(String str) {
        o6.j.e(str, "pattern");
        Pattern compile = Pattern.compile(str);
        o6.j.d(compile, "compile(...)");
        this.f2244d = compile;
    }

    public static A4.a a(k kVar, String str) {
        kVar.getClass();
        o6.j.e(str, "input");
        Matcher matcher = kVar.f2244d.matcher(str);
        o6.j.d(matcher, "matcher(...)");
        if (!matcher.find(0)) {
            return null;
        }
        return new A4.a(matcher, str);
    }

    public final A4.a b(CharSequence charSequence) {
        o6.j.e(charSequence, "input");
        Matcher matcher = this.f2244d.matcher(charSequence);
        o6.j.d(matcher, "matcher(...)");
        if (!matcher.matches()) {
            return null;
        }
        return new A4.a(matcher, charSequence);
    }

    public final boolean c(CharSequence charSequence) {
        o6.j.e(charSequence, "input");
        return this.f2244d.matcher(charSequence).matches();
    }

    public final String toString() {
        String pattern = this.f2244d.toString();
        o6.j.d(pattern, "toString(...)");
        return pattern;
    }

    public k(String str, int i4) {
        o6.j.e(str, "pattern");
        Pattern compile = Pattern.compile(str, 66);
        o6.j.d(compile, "compile(...)");
        this.f2244d = compile;
    }
}
