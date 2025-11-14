package f2;

import l1.C0999a;
import m1.InterfaceC1051a;
import m1.InterfaceC1053c;
import m1.InterfaceC1054d;

/* loaded from: classes.dex */
public abstract class a implements InterfaceC1053c, InterfaceC1051a, InterfaceC1054d {
    @Override // m1.InterfaceC1053c
    public final Long a() {
        return getId().f12188b;
    }

    @Override // m1.InterfaceC1051a
    public boolean d() {
        if (g() != null) {
            return true;
        }
        return false;
    }

    public abstract C0999a f();

    public abstract String g();

    public abstract int h();
}
