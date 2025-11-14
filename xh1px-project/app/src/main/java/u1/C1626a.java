package u1;

import E.t;
import android.content.Context;
import o6.j;
import t0.C1536c;

/* renamed from: u1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1626a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f15295a;

    /* renamed from: b, reason: collision with root package name */
    public final o1.a f15296b;

    /* renamed from: c, reason: collision with root package name */
    public final C1629d f15297c;

    /* renamed from: d, reason: collision with root package name */
    public final t f15298d;

    /* renamed from: e, reason: collision with root package name */
    public final C1536c f15299e;

    public C1626a(Context context, o1.a aVar, C1629d c1629d) {
        j.e(aVar, "notificationIds");
        j.e(c1629d, "scheduler");
        this.f15295a = context;
        this.f15296b = aVar;
        this.f15297c = c1629d;
        this.f15298d = new t(context);
        this.f15299e = new C1536c(aVar);
    }
}
