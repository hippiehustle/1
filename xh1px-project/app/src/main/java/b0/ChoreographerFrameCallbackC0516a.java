package b0;

import J0.l;
import R.g;
import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;
import t.j;

/* renamed from: b0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ChoreographerFrameCallbackC0516a implements Choreographer.FrameCallback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f9011d;

    public ChoreographerFrameCallbackC0516a(g gVar) {
        this.f9011d = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x019c A[SYNTHETIC] */
    @Override // android.view.Choreographer.FrameCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void doFrame(long j) {
        int i4;
        boolean z8;
        C0517b c0517b = (C0517b) ((W0.c) this.f9011d.f4987e).f6486e;
        long uptimeMillis = SystemClock.uptimeMillis();
        ArrayList arrayList = c0517b.f9014b;
        long uptimeMillis2 = SystemClock.uptimeMillis();
        boolean z9 = false;
        int i8 = 0;
        while (i8 < arrayList.size()) {
            C0520e c0520e = (C0520e) arrayList.get(i8);
            if (c0520e != null) {
                j jVar = c0517b.f9013a;
                Long l6 = (Long) jVar.get(c0520e);
                if (l6 != null) {
                    if (l6.longValue() < uptimeMillis2) {
                        jVar.remove(c0520e);
                    }
                }
                long j5 = c0520e.f9035i;
                if (j5 == 0) {
                    c0520e.f9035i = uptimeMillis;
                    c0520e.a(c0520e.f9028b);
                } else {
                    long j8 = uptimeMillis - j5;
                    c0520e.f9035i = uptimeMillis;
                    if (c0520e.f9039o) {
                        float f8 = c0520e.f9038n;
                        if (f8 != Float.MAX_VALUE) {
                            c0520e.f9037m.f9048i = f8;
                            c0520e.f9038n = Float.MAX_VALUE;
                        }
                        c0520e.f9028b = (float) c0520e.f9037m.f9048i;
                        c0520e.f9027a = 0.0f;
                        c0520e.f9039o = z9;
                        i4 = i8;
                    } else {
                        if (c0520e.f9038n != Float.MAX_VALUE) {
                            C0521f c0521f = c0520e.f9037m;
                            double d2 = c0521f.f9048i;
                            i4 = i8;
                            long j9 = j8 / 2;
                            C0519d b4 = c0521f.b(c0520e.f9028b, c0520e.f9027a, j9);
                            C0521f c0521f2 = c0520e.f9037m;
                            c0521f2.f9048i = c0520e.f9038n;
                            c0520e.f9038n = Float.MAX_VALUE;
                            C0519d b9 = c0521f2.b(b4.f9019a, b4.f9020b, j9);
                            c0520e.f9028b = b9.f9019a;
                            c0520e.f9027a = b9.f9020b;
                        } else {
                            i4 = i8;
                            C0519d b10 = c0520e.f9037m.b(c0520e.f9028b, c0520e.f9027a, j8);
                            c0520e.f9028b = b10.f9019a;
                            c0520e.f9027a = b10.f9020b;
                        }
                        float max = Math.max(c0520e.f9028b, c0520e.f9034h);
                        c0520e.f9028b = max;
                        c0520e.f9028b = Math.min(max, c0520e.f9033g);
                        float f9 = c0520e.f9027a;
                        C0521f c0521f3 = c0520e.f9037m;
                        c0521f3.getClass();
                        if (Math.abs(f9) < c0521f3.f9044e && Math.abs(r7 - ((float) c0521f3.f9048i)) < c0521f3.f9043d) {
                            c0520e.f9028b = (float) c0520e.f9037m.f9048i;
                            c0520e.f9027a = 0.0f;
                        } else {
                            z8 = false;
                            float min = Math.min(c0520e.f9028b, c0520e.f9033g);
                            c0520e.f9028b = min;
                            float max2 = Math.max(min, c0520e.f9034h);
                            c0520e.f9028b = max2;
                            c0520e.a(max2);
                            if (z8) {
                                continue;
                            } else {
                                ArrayList arrayList2 = c0520e.k;
                                c0520e.f9032f = false;
                                ThreadLocal threadLocal = C0517b.f9012f;
                                if (threadLocal.get() == null) {
                                    threadLocal.set(new C0517b());
                                }
                                C0517b c0517b2 = (C0517b) threadLocal.get();
                                c0517b2.f9013a.remove(c0520e);
                                ArrayList arrayList3 = c0517b2.f9014b;
                                int indexOf = arrayList3.indexOf(c0520e);
                                if (indexOf >= 0) {
                                    arrayList3.set(indexOf, null);
                                    c0517b2.f9017e = true;
                                }
                                c0520e.f9035i = 0L;
                                c0520e.f9029c = false;
                                for (int i9 = 0; i9 < arrayList2.size(); i9++) {
                                    if (arrayList2.get(i9) != null) {
                                        l lVar = (l) arrayList2.get(i9);
                                        float f10 = c0520e.f9028b;
                                        lVar.getClass();
                                        if (f10 < 1.0f) {
                                            throw null;
                                        }
                                        throw null;
                                    }
                                }
                                for (int size = arrayList2.size() - 1; size >= 0; size--) {
                                    if (arrayList2.get(size) == null) {
                                        arrayList2.remove(size);
                                    }
                                }
                            }
                            i8 = i4 + 1;
                            z9 = false;
                        }
                    }
                    z8 = true;
                    float min2 = Math.min(c0520e.f9028b, c0520e.f9033g);
                    c0520e.f9028b = min2;
                    float max22 = Math.max(min2, c0520e.f9034h);
                    c0520e.f9028b = max22;
                    c0520e.a(max22);
                    if (z8) {
                    }
                    i8 = i4 + 1;
                    z9 = false;
                }
            }
            i4 = i8;
            i8 = i4 + 1;
            z9 = false;
        }
        if (c0517b.f9017e) {
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                if (arrayList.get(size2) == null) {
                    arrayList.remove(size2);
                }
            }
            c0517b.f9017e = false;
        }
        if (arrayList.size() > 0) {
            if (c0517b.f9016d == null) {
                c0517b.f9016d = new g(c0517b.f9015c);
            }
            g gVar = c0517b.f9016d;
            ((Choreographer) gVar.f4988f).postFrameCallback((ChoreographerFrameCallbackC0516a) gVar.f4989g);
        }
    }
}
