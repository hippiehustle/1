package N0;

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: N0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0202j {

    /* renamed from: c, reason: collision with root package name */
    public HashMap f3603c;

    /* renamed from: d, reason: collision with root package name */
    public HashMap f3604d;

    /* renamed from: e, reason: collision with root package name */
    public float f3605e;

    /* renamed from: f, reason: collision with root package name */
    public HashMap f3606f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f3607g;

    /* renamed from: h, reason: collision with root package name */
    public t.k f3608h;

    /* renamed from: i, reason: collision with root package name */
    public t.g f3609i;
    public ArrayList j;
    public Rect k;

    /* renamed from: l, reason: collision with root package name */
    public float f3610l;

    /* renamed from: m, reason: collision with root package name */
    public float f3611m;

    /* renamed from: n, reason: collision with root package name */
    public float f3612n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f3613o;

    /* renamed from: a, reason: collision with root package name */
    public final F f3601a = new F();

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f3602b = new HashSet();

    /* renamed from: p, reason: collision with root package name */
    public int f3614p = 0;

    public final void a(String str) {
        Z0.c.b(str);
        this.f3602b.add(str);
    }

    public final float b() {
        return ((this.f3611m - this.f3610l) / this.f3612n) * 1000.0f;
    }

    public final Map c() {
        float c6 = Z0.k.c();
        if (c6 != this.f3605e) {
            for (Map.Entry entry : this.f3604d.entrySet()) {
                HashMap hashMap = this.f3604d;
                String str = (String) entry.getKey();
                z zVar = (z) entry.getValue();
                float f8 = this.f3605e / c6;
                int i4 = (int) (zVar.f3697a * f8);
                int i8 = (int) (zVar.f3698b * f8);
                z zVar2 = new z(i4, i8, zVar.f3699c, zVar.f3700d, zVar.f3701e);
                Bitmap bitmap = zVar.f3702f;
                if (bitmap != null) {
                    zVar2.f3702f = Bitmap.createScaledBitmap(bitmap, i4, i8, true);
                }
                hashMap.put(str, zVar2);
            }
        }
        this.f3605e = c6;
        return this.f3604d;
    }

    public final S0.h d(String str) {
        int size = this.f3607g.size();
        for (int i4 = 0; i4 < size; i4++) {
            S0.h hVar = (S0.h) this.f3607g.get(i4);
            String str2 = hVar.f5203a;
            if (str2.equalsIgnoreCase(str) || (str2.endsWith("\r") && str2.substring(0, str2.length() - 1).equalsIgnoreCase(str))) {
                return hVar;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            sb.append(((V0.e) it.next()).a("\t"));
        }
        return sb.toString();
    }
}
