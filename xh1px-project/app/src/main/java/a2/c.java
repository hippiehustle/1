package a2;

import android.content.Intent;
import f6.AbstractC0713c;
import n6.InterfaceC1162a;

/* loaded from: classes.dex */
public final class c extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public int f7699g;

    /* renamed from: h, reason: collision with root package name */
    public int f7700h;

    /* renamed from: i, reason: collision with root package name */
    public Intent f7701i;
    public InterfaceC1162a j;
    public U7.a k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f7702l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ h f7703m;

    /* renamed from: n, reason: collision with root package name */
    public int f7704n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(h hVar, AbstractC0713c abstractC0713c) {
        super(abstractC0713c);
        this.f7703m = hVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f7702l = obj;
        this.f7704n |= Integer.MIN_VALUE;
        return this.f7703m.c(0, null, null, this);
    }
}
