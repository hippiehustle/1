package u1;

import E.o;
import E.t;
import L7.AbstractC0160s;
import L7.AbstractC0166y;
import L7.k0;
import L7.l0;
import L7.r;
import android.app.Notification;
import android.content.Context;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: u1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1629d {

    /* renamed from: a, reason: collision with root package name */
    public final t f15305a;

    /* renamed from: b, reason: collision with root package name */
    public final Q7.d f15306b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f15307c;

    /* renamed from: d, reason: collision with root package name */
    public k0 f15308d;

    /* renamed from: e, reason: collision with root package name */
    public long f15309e;

    public C1629d(AbstractC0160s abstractC0160s, Context context) {
        this.f15305a = new t(context);
        l0 c6 = AbstractC0166y.c();
        r rVar = AbstractC0160s.f3242e;
        this.f15306b = AbstractC0166y.b(E2.d.C(c6, abstractC0160s.Q(1)));
        this.f15307c = new LinkedHashMap();
    }

    public static final void a(C1629d c1629d) {
        t tVar = c1629d.f15305a;
        LinkedHashMap linkedHashMap = c1629d.f15307c;
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(new o(((Number) entry.getKey()).intValue(), (Notification) entry.getValue()));
        }
        tVar.getClass();
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            o oVar = (o) arrayList.get(i4);
            oVar.getClass();
            tVar.b(oVar.f1126a, oVar.f1127b);
        }
        linkedHashMap.clear();
        c1629d.f15309e = System.currentTimeMillis();
    }
}
