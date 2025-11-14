package c2;

import f6.AbstractC0713c;
import java.util.Iterator;
import java.util.List;
import l1.C0999a;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class c extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public C0999a f9515g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC1164c f9516h;

    /* renamed from: i, reason: collision with root package name */
    public List f9517i;
    public Iterator j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f9518l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ z f9519m;

    /* renamed from: n, reason: collision with root package name */
    public int f9520n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(z zVar, AbstractC0713c abstractC0713c) {
        super(abstractC0713c);
        this.f9519m = zVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f9518l = obj;
        this.f9520n |= Integer.MIN_VALUE;
        return this.f9519m.e(null, null, this);
    }
}
