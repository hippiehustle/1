package H;

import M.m;
import M.n;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final E2.b f1855a;

    /* renamed from: b, reason: collision with root package name */
    public static final t.i f1856b;

    static {
        E2.c.I("TypefaceCompat static init");
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 29) {
            f1855a = new E2.b();
        } else if (i4 >= 28) {
            f1855a = new i();
        } else if (i4 >= 26) {
            f1855a = new i();
        } else {
            Method method = h.f1864f;
            if (method == null) {
                Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            if (method != null) {
                f1855a = new E2.b();
            } else {
                f1855a = new E2.b();
            }
        }
        f1856b = new t.i(16);
        Trace.endSection();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
    
        if (r3.equals(r8) == false) goto L15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface a(Context context, G.e eVar, Resources resources, int i4, String str, int i8, int i9, G.b bVar, boolean z8) {
        Typeface i10;
        Typeface typeface;
        Object[] objArr;
        int i11;
        List unmodifiableList;
        Handler handler;
        Typeface typeface2;
        int i12 = -3;
        int i13 = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        if (eVar instanceof G.h) {
            G.h hVar = (G.h) eVar;
            String str2 = hVar.f1664e;
            if (str2 != null && !str2.isEmpty()) {
                typeface = Typeface.create(str2, 0);
                Typeface create = Typeface.create(Typeface.DEFAULT, 0);
                if (typeface != null) {
                }
            }
            typeface = null;
            if (typeface != null) {
                if (bVar != null) {
                    new Handler(Looper.getMainLooper()).post(new G.k(bVar, i13, typeface));
                }
                return typeface;
            }
            int i14 = 1;
            if (!z8 ? bVar == null : hVar.f1663d == 0) {
                objArr = true;
            } else {
                objArr = false;
            }
            if (z8) {
                i11 = hVar.f1662c;
            } else {
                i11 = -1;
            }
            Handler handler2 = new Handler(Looper.getMainLooper());
            int i15 = 5;
            W0.c cVar = new W0.c(i15, (boolean) (objArr4 == true ? 1 : 0));
            cVar.f6486e = bVar;
            M.d dVar = hVar.f1661b;
            int i16 = 2;
            if (dVar != null) {
                Object[] objArr5 = {hVar.f1660a, dVar};
                ArrayList arrayList = new ArrayList(2);
                for (int i17 = 0; i17 < 2; i17++) {
                    Object obj = objArr5[i17];
                    Objects.requireNonNull(obj);
                    arrayList.add(obj);
                }
                unmodifiableList = Collections.unmodifiableList(arrayList);
            } else {
                Object[] objArr6 = {hVar.f1660a};
                ArrayList arrayList2 = new ArrayList(1);
                Object obj2 = objArr6[0];
                Objects.requireNonNull(obj2);
                arrayList2.add(obj2);
                unmodifiableList = Collections.unmodifiableList(arrayList2);
            }
            m mVar = new m(handler2);
            A.i iVar = new A.i(cVar, 15, mVar);
            if (objArr != false) {
                if (unmodifiableList.size() <= 1) {
                    M.d dVar2 = (M.d) unmodifiableList.get(0);
                    t.i iVar2 = M.h.f3283a;
                    ArrayList arrayList3 = new ArrayList(1);
                    Object obj3 = new Object[]{dVar2}[0];
                    Objects.requireNonNull(obj3);
                    arrayList3.add(obj3);
                    String a3 = M.h.a(i9, Collections.unmodifiableList(arrayList3));
                    Typeface typeface3 = (Typeface) M.h.f3283a.f(a3);
                    if (typeface3 != null) {
                        mVar.execute(new E.b(cVar, i15, typeface3));
                        typeface2 = typeface3;
                    } else if (i11 == -1) {
                        Object[] objArr7 = {dVar2};
                        ArrayList arrayList4 = new ArrayList(1);
                        Object obj4 = objArr7[0];
                        Objects.requireNonNull(obj4);
                        arrayList4.add(obj4);
                        M.g b4 = M.h.b(a3, context, Collections.unmodifiableList(arrayList4), i9);
                        iVar.f(b4);
                        typeface2 = b4.f3281a;
                    } else {
                        try {
                            try {
                                try {
                                    try {
                                        M.g gVar = (M.g) M.h.f3284b.submit(new M.e(a3, context, dVar2, i9, 0)).get(i11, TimeUnit.MILLISECONDS);
                                        iVar.f(gVar);
                                        typeface2 = gVar.f3281a;
                                    } catch (TimeoutException unused) {
                                        throw new InterruptedException("timeout");
                                    }
                                } catch (InterruptedException e9) {
                                    throw e9;
                                }
                            } catch (ExecutionException e10) {
                                throw new RuntimeException(e10);
                            }
                        } catch (InterruptedException unused2) {
                            ((m) iVar.f89f).execute(new A5.c((W0.c) iVar.f88e, i12, i16));
                        }
                    }
                } else {
                    throw new IllegalArgumentException("Fallbacks with blocking fetches are not supported for performance reasons");
                }
            } else {
                String a4 = M.h.a(i9, unmodifiableList);
                Typeface typeface4 = (Typeface) M.h.f3283a.f(a4);
                if (typeface4 != null) {
                    mVar.execute(new E.b(cVar, i15, typeface4));
                    typeface2 = typeface4;
                } else {
                    M.f fVar = new M.f(objArr3 == true ? 1 : 0, iVar);
                    synchronized (M.h.f3285c) {
                        try {
                            t.j jVar = M.h.f3286d;
                            ArrayList arrayList5 = (ArrayList) jVar.get(a4);
                            if (arrayList5 != null) {
                                arrayList5.add(fVar);
                            } else {
                                ArrayList arrayList6 = new ArrayList();
                                arrayList6.add(fVar);
                                jVar.put(a4, arrayList6);
                                M.e eVar2 = new M.e(a4, context, unmodifiableList, i9, 1);
                                ThreadPoolExecutor threadPoolExecutor = M.h.f3284b;
                                M.f fVar2 = new M.f(i14, a4);
                                if (Looper.myLooper() == null) {
                                    handler = new Handler(Looper.getMainLooper());
                                } else {
                                    handler = new Handler();
                                }
                                n nVar = new n();
                                nVar.f3298e = eVar2;
                                nVar.f3299f = fVar2;
                                nVar.f3300g = handler;
                                threadPoolExecutor.execute(nVar);
                            }
                        } finally {
                        }
                    }
                    typeface2 = null;
                }
            }
            i10 = typeface2;
        } else {
            i10 = f1855a.i(context, (G.f) eVar, resources, i9);
            if (bVar != null) {
                if (i10 != null) {
                    new Handler(Looper.getMainLooper()).post(new G.k(bVar, objArr2 == true ? 1 : 0, i10));
                } else {
                    bVar.a(-3);
                }
            }
        }
        if (i10 != null) {
            f1856b.j(b(resources, i4, str, i8, i9), i10);
        }
        return i10;
    }

    public static String b(Resources resources, int i4, String str, int i8, int i9) {
        return resources.getResourcePackageName(i4) + '-' + str + '-' + i8 + '-' + i4 + '-' + i9;
    }
}
