package u7;

import C6.InterfaceC0004e;
import C6.InterfaceC0009j;
import C6.InterfaceC0010k;
import C6.InterfaceC0019u;
import C6.O;
import F6.AbstractC0061v;
import F6.B;
import F6.C0050j;
import a7.C0453n;
import c7.C0590i;
import c7.InterfaceC0588g;
import f7.C0725e;
import g7.AbstractC0793b;
import n1.AbstractC1149a;

/* renamed from: u7.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1650c extends C0050j implements InterfaceC1649b {

    /* renamed from: I, reason: collision with root package name */
    public final C0453n f15386I;

    /* renamed from: J, reason: collision with root package name */
    public final InterfaceC0588g f15387J;
    public final B K;

    /* renamed from: L, reason: collision with root package name */
    public final C0590i f15388L;

    /* renamed from: M, reason: collision with root package name */
    public final InterfaceC1657j f15389M;

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public C1650c(C6.InterfaceC0004e r12, C6.InterfaceC0009j r13, D6.j r14, boolean r15, int r16, a7.C0453n r17, c7.InterfaceC0588g r18, F6.B r19, c7.C0590i r20, u7.InterfaceC1657j r21, C6.O r22) {
        /*
            r11 = this;
            r7 = r17
            r8 = r18
            r9 = r19
            r10 = r20
            java.lang.String r0 = "containingDeclaration"
            o6.j.e(r12, r0)
            java.lang.String r0 = "annotations"
            o6.j.e(r14, r0)
            java.lang.String r0 = "kind"
            r5 = r16
            n1.AbstractC1149a.l(r0, r5)
            java.lang.String r0 = "proto"
            o6.j.e(r7, r0)
            java.lang.String r0 = "nameResolver"
            o6.j.e(r8, r0)
            java.lang.String r0 = "typeTable"
            o6.j.e(r9, r0)
            java.lang.String r0 = "versionRequirementTable"
            o6.j.e(r10, r0)
            if (r22 != 0) goto L38
            C6.P r0 = C6.O.f726a
            r6 = r0
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r0 = r11
            goto L3f
        L38:
            r6 = r22
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
        L3f:
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r11.f15386I = r7
            r11.f15387J = r8
            r11.K = r9
            r11.f15388L = r10
            r1 = r21
            r11.f15389M = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.C1650c.<init>(C6.e, C6.j, D6.j, boolean, int, a7.n, c7.g, F6.B, c7.i, u7.j, C6.O):void");
    }

    @Override // u7.k
    public final InterfaceC0588g C0() {
        return this.f15387J;
    }

    @Override // F6.C0050j, F6.AbstractC0061v
    public final /* bridge */ /* synthetic */ AbstractC0061v O0(int i4, InterfaceC0010k interfaceC0010k, InterfaceC0019u interfaceC0019u, O o7, D6.j jVar, C0725e c0725e) {
        return d1(interfaceC0010k, interfaceC0019u, i4, jVar, o7);
    }

    @Override // u7.k
    public final AbstractC0793b P() {
        return this.f15386I;
    }

    @Override // F6.C0050j
    /* renamed from: X0 */
    public final /* bridge */ /* synthetic */ C0050j O0(int i4, InterfaceC0010k interfaceC0010k, InterfaceC0019u interfaceC0019u, O o7, D6.j jVar, C0725e c0725e) {
        return d1(interfaceC0010k, interfaceC0019u, i4, jVar, o7);
    }

    public final C1650c d1(InterfaceC0010k interfaceC0010k, InterfaceC0019u interfaceC0019u, int i4, D6.j jVar, O o7) {
        o6.j.e(interfaceC0010k, "newOwner");
        AbstractC1149a.l("kind", i4);
        o6.j.e(jVar, "annotations");
        C1650c c1650c = new C1650c((InterfaceC0004e) interfaceC0010k, (InterfaceC0009j) interfaceC0019u, jVar, this.f1536H, i4, this.f15386I, this.f15387J, this.K, this.f15388L, this.f15389M, o7);
        c1650c.f1602z = this.f1602z;
        return c1650c;
    }

    @Override // F6.AbstractC0061v, C6.InterfaceC0019u
    public final boolean g() {
        return false;
    }

    @Override // F6.AbstractC0061v, C6.InterfaceC0019u
    public final boolean i0() {
        return false;
    }

    @Override // F6.AbstractC0061v, C6.InterfaceC0019u
    public final boolean p() {
        return false;
    }

    @Override // u7.k
    public final B p0() {
        return this.K;
    }

    @Override // u7.k
    public final InterfaceC1657j w() {
        return this.f15389M;
    }

    @Override // F6.AbstractC0061v, C6.InterfaceC0022x
    public final boolean z() {
        return false;
    }
}
