package P6;

import C6.InterfaceC0001b;
import C6.InterfaceC0007h;
import C6.T;
import i7.C0887b;
import i7.C0888c;
import java.util.ArrayList;
import w7.J;
import x7.InterfaceC1821c;

/* loaded from: classes.dex */
public final class s implements InterfaceC1821c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4586a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4587b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f4588c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f4589d;

    public s(InterfaceC0001b interfaceC0001b, InterfaceC0001b interfaceC0001b2, boolean z8) {
        this.f4586a = 2;
        this.f4587b = z8;
        this.f4588c = interfaceC0001b;
        this.f4589d = interfaceC0001b2;
    }

    @Override // x7.InterfaceC1821c
    public boolean a(J j, J j5) {
        boolean z8 = this.f4587b;
        InterfaceC0001b interfaceC0001b = (InterfaceC0001b) this.f4588c;
        InterfaceC0001b interfaceC0001b2 = (InterfaceC0001b) this.f4589d;
        o6.j.e(j, "c1");
        o6.j.e(j5, "c2");
        if (j.equals(j5)) {
            return true;
        }
        InterfaceC0007h c6 = j.c();
        InterfaceC0007h c9 = j5.c();
        if ((c6 instanceof T) && (c9 instanceof T)) {
            C0887b c0887b = new C0887b(interfaceC0001b, interfaceC0001b2);
            return C0888c.f11773a.d((T) c6, (T) c9, z8, c0887b);
        }
        return false;
    }

    public String toString() {
        switch (this.f4586a) {
            case 0:
                return "JavaTypeEnhancementState(jsr305=" + ((u) this.f4588c) + ", getReportLevelForAnnotation=" + ((B6.n) this.f4589d) + ')';
            default:
                return super.toString();
        }
    }

    public s(u uVar, B6.n nVar) {
        this.f4586a = 0;
        this.f4588c = uVar;
        this.f4589d = nVar;
        this.f4587b = uVar.f4594d || nVar.m(q.f4578a) == A.f4515d;
    }

    public s(c.k kVar, B0.e eVar) {
        this.f4586a = 1;
        this.f4588c = new Object();
        this.f4589d = new ArrayList();
    }
}
