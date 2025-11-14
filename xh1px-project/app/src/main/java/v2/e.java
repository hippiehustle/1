package v2;

import android.content.Context;
import f6.AbstractC0713c;
import java.util.List;
import l2.C1001a;

/* loaded from: classes.dex */
public final class e extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public Context f15491g;

    /* renamed from: h, reason: collision with root package name */
    public j f15492h;

    /* renamed from: i, reason: collision with root package name */
    public J7.a f15493i;
    public C1001a j;
    public List k;

    /* renamed from: l, reason: collision with root package name */
    public long f15494l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f15495m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ h f15496n;

    /* renamed from: o, reason: collision with root package name */
    public int f15497o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h hVar, AbstractC0713c abstractC0713c) {
        super(abstractC0713c);
        this.f15496n = hVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f15495m = obj;
        this.f15497o |= Integer.MIN_VALUE;
        return this.f15496n.c(null, null, this);
    }
}
