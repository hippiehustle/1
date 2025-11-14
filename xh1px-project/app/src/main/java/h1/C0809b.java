package h1;

import R.g;
import f6.AbstractC0713c;
import java.util.Iterator;
import m1.InterfaceC1053c;
import n6.InterfaceC1164c;

/* renamed from: h1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0809b extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public InterfaceC1164c f11311g;

    /* renamed from: h, reason: collision with root package name */
    public Iterator f11312h;

    /* renamed from: i, reason: collision with root package name */
    public InterfaceC1053c f11313i;
    public int j;
    public /* synthetic */ Object k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f11314l;

    /* renamed from: m, reason: collision with root package name */
    public int f11315m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0809b(g gVar, AbstractC0713c abstractC0713c) {
        super(abstractC0713c);
        this.f11314l = gVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.k = obj;
        this.f11315m |= Integer.MIN_VALUE;
        return this.f11314l.M(null, null, null, this);
    }
}
