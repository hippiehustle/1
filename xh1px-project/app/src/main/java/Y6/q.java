package Y6;

import n6.InterfaceC1163b;

/* loaded from: classes.dex */
public final class q implements InterfaceC1163b {

    /* renamed from: d, reason: collision with root package name */
    public static final q f7238d = new Object();

    @Override // n6.InterfaceC1163b
    public final Object m(Object obj) {
        String str = (String) obj;
        o6.j.e(str, "it");
        if (str.length() > 1) {
            return "L" + str + ';';
        }
        return str;
    }
}
