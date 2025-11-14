package s7;

import C6.O;
import a7.C0450k;
import c7.AbstractC0582a;
import c7.InterfaceC0588g;

/* renamed from: s7.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1513d {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0588g f14563a;

    /* renamed from: b, reason: collision with root package name */
    public final C0450k f14564b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC0582a f14565c;

    /* renamed from: d, reason: collision with root package name */
    public final O f14566d;

    public C1513d(InterfaceC0588g interfaceC0588g, C0450k c0450k, AbstractC0582a abstractC0582a, O o7) {
        o6.j.e(interfaceC0588g, "nameResolver");
        o6.j.e(c0450k, "classProto");
        o6.j.e(o7, "sourceElement");
        this.f14563a = interfaceC0588g;
        this.f14564b = c0450k;
        this.f14565c = abstractC0582a;
        this.f14566d = o7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1513d)) {
            return false;
        }
        C1513d c1513d = (C1513d) obj;
        if (o6.j.a(this.f14563a, c1513d.f14563a) && o6.j.a(this.f14564b, c1513d.f14564b) && o6.j.a(this.f14565c, c1513d.f14565c) && o6.j.a(this.f14566d, c1513d.f14566d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f14566d.hashCode() + ((this.f14565c.hashCode() + ((this.f14564b.hashCode() + (this.f14563a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ClassData(nameResolver=" + this.f14563a + ", classProto=" + this.f14564b + ", metadataVersion=" + this.f14565c + ", sourceElement=" + this.f14566d + ')';
    }
}
