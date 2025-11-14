package u7;

import C6.InterfaceC0010k;
import C6.InterfaceC0019u;
import C6.O;
import F6.AbstractC0061v;
import F6.B;
import F6.N;
import a7.C0439A;
import c7.C0590i;
import c7.InterfaceC0588g;
import f7.C0725e;
import g7.AbstractC0793b;
import n1.AbstractC1149a;

/* loaded from: classes.dex */
public final class r extends N implements InterfaceC1649b {

    /* renamed from: H, reason: collision with root package name */
    public final C0439A f15445H;

    /* renamed from: I, reason: collision with root package name */
    public final InterfaceC0588g f15446I;

    /* renamed from: J, reason: collision with root package name */
    public final B f15447J;
    public final C0590i K;

    /* renamed from: L, reason: collision with root package name */
    public final InterfaceC1657j f15448L;

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public r(C6.InterfaceC0010k r12, F6.N r13, D6.j r14, f7.C0725e r15, int r16, a7.C0439A r17, c7.InterfaceC0588g r18, F6.B r19, c7.C0590i r20, u7.InterfaceC1657j r21, C6.O r22) {
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
            r11.f15445H = r7
            r11.f15446I = r8
            r11.f15447J = r9
            r11.K = r10
            r1 = r21
            r11.f15448L = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.r.<init>(C6.k, F6.N, D6.j, f7.e, int, a7.A, c7.g, F6.B, c7.i, u7.j, C6.O):void");
    }

    @Override // u7.k
    public final InterfaceC0588g C0() {
        return this.f15446I;
    }

    @Override // F6.N, F6.AbstractC0061v
    public final AbstractC0061v O0(int i4, InterfaceC0010k interfaceC0010k, InterfaceC0019u interfaceC0019u, O o7, D6.j jVar, C0725e c0725e) {
        C0725e c0725e2;
        o6.j.e(interfaceC0010k, "newOwner");
        AbstractC1149a.l("kind", i4);
        o6.j.e(jVar, "annotations");
        N n3 = (N) interfaceC0019u;
        if (c0725e == null) {
            C0725e name = getName();
            o6.j.d(name, "getName(...)");
            c0725e2 = name;
        } else {
            c0725e2 = c0725e;
        }
        r rVar = new r(interfaceC0010k, n3, jVar, c0725e2, i4, this.f15445H, this.f15446I, this.f15447J, this.K, this.f15448L, o7);
        rVar.f1602z = this.f1602z;
        return rVar;
    }

    @Override // u7.k
    public final AbstractC0793b P() {
        return this.f15445H;
    }

    @Override // u7.k
    public final B p0() {
        return this.f15447J;
    }

    @Override // u7.k
    public final InterfaceC1657j w() {
        return this.f15448L;
    }
}
