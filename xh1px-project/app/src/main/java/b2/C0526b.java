package b2;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: b2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0526b extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public List f9054g;

    /* renamed from: h, reason: collision with root package name */
    public Collection f9055h;

    /* renamed from: i, reason: collision with root package name */
    public Iterator f9056i;
    public Object j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public int f9057l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f9058m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ r f9059n;

    /* renamed from: o, reason: collision with root package name */
    public int f9060o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0526b(r rVar, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f9059n = rVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f9058m = obj;
        this.f9060o |= Integer.MIN_VALUE;
        return r.a(this.f9059n, null, this);
    }
}
