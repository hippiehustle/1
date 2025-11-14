package u7;

import C6.C0014o;
import C6.EnumC0023y;
import C6.InterfaceC0010k;
import C6.M;
import C6.O;
import F6.B;
import F6.K;
import a7.I;
import c7.AbstractC0586e;
import c7.C0590i;
import c7.InterfaceC0588g;
import f7.C0725e;
import g7.AbstractC0793b;
import n1.AbstractC1149a;

/* loaded from: classes.dex */
public final class q extends K implements InterfaceC1649b {

    /* renamed from: E, reason: collision with root package name */
    public final I f15440E;

    /* renamed from: F, reason: collision with root package name */
    public final InterfaceC0588g f15441F;

    /* renamed from: G, reason: collision with root package name */
    public final B f15442G;

    /* renamed from: H, reason: collision with root package name */
    public final C0590i f15443H;

    /* renamed from: I, reason: collision with root package name */
    public final InterfaceC1657j f15444I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(InterfaceC0010k interfaceC0010k, M m6, D6.j jVar, EnumC0023y enumC0023y, C0014o c0014o, boolean z8, C0725e c0725e, int i4, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, I i8, InterfaceC0588g interfaceC0588g, B b4, C0590i c0590i, InterfaceC1657j interfaceC1657j) {
        super(interfaceC0010k, m6, jVar, enumC0023y, c0014o, z8, c0725e, i4, O.f726a, z9, z10, z13, z11, z12);
        o6.j.e(interfaceC0010k, "containingDeclaration");
        o6.j.e(jVar, "annotations");
        o6.j.e(enumC0023y, "modality");
        o6.j.e(c0014o, "visibility");
        o6.j.e(c0725e, "name");
        AbstractC1149a.l("kind", i4);
        o6.j.e(i8, "proto");
        o6.j.e(interfaceC0588g, "nameResolver");
        o6.j.e(b4, "typeTable");
        o6.j.e(c0590i, "versionRequirementTable");
        this.f15440E = i8;
        this.f15441F = interfaceC0588g;
        this.f15442G = b4;
        this.f15443H = c0590i;
        this.f15444I = interfaceC1657j;
    }

    @Override // u7.k
    public final InterfaceC0588g C0() {
        return this.f15441F;
    }

    @Override // F6.K
    public final K O0(InterfaceC0010k interfaceC0010k, EnumC0023y enumC0023y, C0014o c0014o, M m6, int i4, C0725e c0725e) {
        o6.j.e(interfaceC0010k, "newOwner");
        o6.j.e(enumC0023y, "newModality");
        o6.j.e(c0014o, "newVisibility");
        AbstractC1149a.l("kind", i4);
        o6.j.e(c0725e, "newName");
        return new q(interfaceC0010k, m6, getAnnotations(), enumC0023y, c0014o, this.j, c0725e, i4, this.f1491r, this.f1492s, z(), this.f1495v, this.f1493t, this.f15440E, this.f15441F, this.f15442G, this.f15443H, this.f15444I);
    }

    @Override // u7.k
    public final AbstractC0793b P() {
        return this.f15440E;
    }

    @Override // u7.k
    public final B p0() {
        return this.f15442G;
    }

    @Override // u7.k
    public final InterfaceC1657j w() {
        return this.f15444I;
    }

    @Override // F6.K, C6.InterfaceC0022x
    public final boolean z() {
        return AbstractC0586e.f9686E.c(this.f15440E.f7856g).booleanValue();
    }
}
