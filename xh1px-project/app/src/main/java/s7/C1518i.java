package s7;

import C6.F;
import C6.I;
import C6.InterfaceC0004e;
import c7.AbstractC0582a;
import c7.C0590i;
import c7.InterfaceC0588g;
import f7.C0722b;
import g7.C0799h;
import java.util.List;
import java.util.Set;
import o.p1;
import u7.InterfaceC1657j;
import w7.C1749k;
import x7.C1828j;

/* renamed from: s7.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1518i {

    /* renamed from: a, reason: collision with root package name */
    public final v7.k f14573a;

    /* renamed from: b, reason: collision with root package name */
    public final C6.A f14574b;

    /* renamed from: c, reason: collision with root package name */
    public final C1519j f14575c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC1514e f14576d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC1510a f14577e;

    /* renamed from: f, reason: collision with root package name */
    public final I f14578f;

    /* renamed from: g, reason: collision with root package name */
    public final C1519j f14579g;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC1521l f14580h;

    /* renamed from: i, reason: collision with root package name */
    public final K6.a f14581i;
    public final InterfaceC1522m j;
    public final Iterable k;

    /* renamed from: l, reason: collision with root package name */
    public final A4.a f14582l;

    /* renamed from: m, reason: collision with root package name */
    public final C1519j f14583m;

    /* renamed from: n, reason: collision with root package name */
    public final E6.b f14584n;

    /* renamed from: o, reason: collision with root package name */
    public final E6.d f14585o;

    /* renamed from: p, reason: collision with root package name */
    public final C0799h f14586p;

    /* renamed from: q, reason: collision with root package name */
    public final x7.k f14587q;

    /* renamed from: r, reason: collision with root package name */
    public final List f14588r;

    /* renamed from: s, reason: collision with root package name */
    public final InterfaceC1520k f14589s;

    /* renamed from: t, reason: collision with root package name */
    public final C1516g f14590t;

    public C1518i(v7.k kVar, C6.A a3, InterfaceC1514e interfaceC1514e, InterfaceC1510a interfaceC1510a, I i4, InterfaceC1521l interfaceC1521l, InterfaceC1522m interfaceC1522m, Iterable iterable, A4.a aVar, E6.b bVar, E6.d dVar, C0799h c0799h, x7.k kVar2, G5.e eVar, List list, InterfaceC1520k interfaceC1520k) {
        C1519j c1519j = C1519j.f14591c;
        C1519j c1519j2 = C1519j.f14595g;
        o6.j.e(a3, "moduleDescriptor");
        o6.j.e(c0799h, "extensionRegistryLite");
        o6.j.e(kVar2, "kotlinTypeChecker");
        o6.j.e(interfaceC1520k, "enumEntriesDeserializationSupport");
        this.f14573a = kVar;
        this.f14574b = a3;
        this.f14575c = c1519j;
        this.f14576d = interfaceC1514e;
        this.f14577e = interfaceC1510a;
        this.f14578f = i4;
        this.f14579g = c1519j2;
        this.f14580h = interfaceC1521l;
        this.f14581i = K6.a.f2729a;
        this.j = interfaceC1522m;
        this.k = iterable;
        this.f14582l = aVar;
        this.f14583m = C1517h.f14572a;
        this.f14584n = bVar;
        this.f14585o = dVar;
        this.f14586p = c0799h;
        this.f14587q = kVar2;
        this.f14588r = list;
        this.f14589s = interfaceC1520k;
        this.f14590t = new C1516g(this);
    }

    public final F3.m a(F f8, InterfaceC0588g interfaceC0588g, F6.B b4, C0590i c0590i, AbstractC0582a abstractC0582a, InterfaceC1657j interfaceC1657j) {
        o6.j.e(interfaceC0588g, "nameResolver");
        o6.j.e(abstractC0582a, "metadataVersion");
        return new F3.m(this, interfaceC0588g, f8, b4, c0590i, abstractC0582a, interfaceC1657j, (p1) null, a6.s.f7766d);
    }

    public final InterfaceC0004e b(C0722b c0722b) {
        o6.j.e(c0722b, "classId");
        Set set = C1516g.f14569c;
        return this.f14590t.a(c0722b, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1518i(v7.k kVar, C6.A a3, W5.a aVar, R3.r rVar, I i4, Iterable iterable, A4.a aVar2, E6.b bVar, E6.d dVar, C0799h c0799h, x7.k kVar2, G5.e eVar, int i8) {
        this(kVar, a3, aVar, rVar, i4, InterfaceC1521l.f14597a, r7, iterable, aVar2, bVar, dVar, c0799h, r13, eVar, E2.d.y(C1749k.f16000a), (i8 & 524288) != 0 ? C1519j.f14592d : r0);
        x7.k kVar3;
        C1519j c1519j = C1519j.f14593e;
        C1519j c1519j2 = C1519j.f14594f;
        if ((i8 & 65536) != 0) {
            x7.k.f16296b.getClass();
            kVar3 = C1828j.f16295b;
        } else {
            kVar3 = kVar2;
        }
    }
}
