package k2;

import h7.AbstractC0842e;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import l1.C0999a;
import m1.InterfaceC1051a;
import m1.InterfaceC1053c;
import o6.j;

/* renamed from: k2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0951a implements InterfaceC1053c, InterfaceC1051a {
    public static AbstractC0951a f(AbstractC0951a abstractC0951a, String str, int i4, boolean z8, int i8) {
        C0999a id = abstractC0951a.getId();
        C0999a l6 = abstractC0951a.l();
        if ((i8 & 4) != 0) {
            str = abstractC0951a.k();
        }
        String str2 = str;
        if ((i8 & 8) != 0) {
            i4 = abstractC0951a.h();
        }
        int i9 = i4;
        if ((i8 & 16) != 0) {
            z8 = abstractC0951a.j();
        }
        boolean z9 = z8;
        List g8 = abstractC0951a.g();
        List i10 = abstractC0951a.i();
        abstractC0951a.getClass();
        j.e(id, "id");
        j.e(l6, "scenarioId");
        j.e(str2, "name");
        j.e(g8, "actions");
        j.e(i10, "conditions");
        if (abstractC0951a instanceof C0952b) {
            return C0952b.m((C0952b) abstractC0951a, id, l6, str2, i9, g8, i10, z9, 0, false, 384);
        }
        if (abstractC0951a instanceof C0953c) {
            return C0953c.m(id, l6, str2, i9, g8, i10, z9);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // m1.InterfaceC1053c
    public final Long a() {
        return getId().f12188b;
    }

    @Override // m1.InterfaceC1051a
    public boolean d() {
        if (k().length() > 0 && !g().isEmpty() && AbstractC0842e.b(g()) && !i().isEmpty() && AbstractC0842e.b(i())) {
            return true;
        }
        return false;
    }

    public abstract List g();

    public abstract int h();

    public abstract List i();

    public abstract boolean j();

    public abstract String k();

    public abstract C0999a l();
}
