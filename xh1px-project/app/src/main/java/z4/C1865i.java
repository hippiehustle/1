package z4;

import android.content.Context;
import f6.AbstractC0713c;
import java.util.List;
import l2.C1001a;

/* renamed from: z4.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1865i extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public Context f16656g;

    /* renamed from: h, reason: collision with root package name */
    public C1001a f16657h;

    /* renamed from: i, reason: collision with root package name */
    public List f16658i;
    public U7.c j;
    public /* synthetic */ Object k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C1866j f16659l;

    /* renamed from: m, reason: collision with root package name */
    public int f16660m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1865i(C1866j c1866j, AbstractC0713c abstractC0713c) {
        super(abstractC0713c);
        this.f16659l = c1866j;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.k = obj;
        this.f16660m |= Integer.MIN_VALUE;
        return this.f16659l.D(null, null, null, this);
    }
}
