package E;

import N0.E;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Trace;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.C0512x;
import androidx.lifecycle.EnumC0503n;
import androidx.lifecycle.H;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import g0.AbstractComponentCallbacksC0755y;
import g0.T;
import i.AbstractActivityC0870i;
import java.io.ByteArrayInputStream;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.util.Iterator;
import p0.C1301i;
import q4.X;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1080d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1081e;

    public /* synthetic */ a(int i4, Object obj) {
        this.f1080d = i4;
        this.f1081e = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7 */
    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Application application;
        c cVar;
        int i4 = 0;
        int i8 = 1;
        switch (this.f1080d) {
            case 0:
                Activity activity = (Activity) this.f1081e;
                if (!activity.isFinishing()) {
                    Handler handler = d.f1097g;
                    Method method = d.f1096f;
                    int i9 = Build.VERSION.SDK_INT;
                    if (i9 >= 28) {
                        activity.recreate();
                        return;
                    }
                    ?? r72 = 27;
                    if (((i9 != 26 && i9 != 27) || method != null) && (d.f1095e != null || d.f1094d != null)) {
                        try {
                            Object obj2 = d.f1093c.get(activity);
                            if (obj2 != null && (obj = d.f1092b.get(activity)) != null) {
                                Application application2 = activity.getApplication();
                                c cVar2 = new c(activity);
                                application2.registerActivityLifecycleCallbacks(cVar2);
                                handler.post(new b(cVar2, i4, obj2));
                                if (i9 != 26 && i9 != 27) {
                                    application = null;
                                } else {
                                    application = 1;
                                }
                                try {
                                    if (application != null) {
                                        try {
                                            Boolean bool = Boolean.FALSE;
                                            application = application2;
                                            r72 = cVar2;
                                            method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                                        } catch (Throwable th) {
                                            th = th;
                                            application = application2;
                                            cVar = cVar2;
                                            handler.post(new b(application, cVar, i8, false ? 1 : 0));
                                            throw th;
                                        }
                                    } else {
                                        application = application2;
                                        r72 = cVar2;
                                        activity.recreate();
                                    }
                                    handler.post(new b(application, r72, i8, false ? 1 : 0));
                                    return;
                                } catch (Throwable th2) {
                                    th = th2;
                                    cVar = r72;
                                }
                            }
                        } catch (Throwable unused) {
                        }
                    }
                    activity.recreate();
                    return;
                }
                return;
            case 1:
                H5.g gVar = (H5.g) this.f1081e;
                gVar.f2033c = false;
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) gVar.f2035e;
                W.e eVar = sideSheetBehavior.f10216i;
                if (eVar != null && eVar.f()) {
                    gVar.a(gVar.f2032b);
                    return;
                } else {
                    if (sideSheetBehavior.f10215h == 2) {
                        sideSheetBehavior.x(gVar.f2032b);
                        return;
                    }
                    return;
                }
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                ((L5.d) this.f1081e).t(true);
                return;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                L5.i iVar = (L5.i) this.f1081e;
                boolean isPopupShowing = iVar.f2953h.isPopupShowing();
                iVar.t(isPopupShowing);
                iVar.f2956m = isPopupShowing;
                return;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                ((TextInputLayout) this.f1081e).f10276g.requestLayout();
                return;
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                Z0.k.b((ByteArrayInputStream) this.f1081e);
                return;
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                ((E) this.f1081e).c();
                return;
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                H h8 = (H) this.f1081e;
                C0512x c0512x = h8.f8782i;
                if (h8.f8778e == 0) {
                    h8.f8779f = true;
                    c0512x.d(EnumC0503n.ON_PAUSE);
                }
                if (h8.f8777d == 0 && h8.f8779f) {
                    c0512x.d(EnumC0503n.ON_STOP);
                    h8.f8780g = true;
                    return;
                }
                return;
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                ((AbstractActivityC0870i) this.f1081e).invalidateOptionsMenu();
                return;
            case 9:
                c.k kVar = (c.k) this.f1081e;
                Runnable runnable = kVar.f9331e;
                if (runnable != null) {
                    runnable.run();
                    kVar.f9331e = null;
                    return;
                }
                return;
            case 10:
                c.m.a((c.m) this.f1081e);
                return;
            case 11:
                c0.t tVar = (c0.t) this.f1081e;
                synchronized (tVar.f9412d) {
                    try {
                        if (tVar.f9416h != null) {
                            try {
                                M.j c6 = tVar.c();
                                int i10 = c6.f3293e;
                                if (i10 == 2) {
                                    synchronized (tVar.f9412d) {
                                    }
                                }
                                if (i10 == 0) {
                                    try {
                                        Method method2 = L.f.f2746b;
                                        Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                        G5.e eVar2 = tVar.f9411c;
                                        Context context = tVar.f9409a;
                                        eVar2.getClass();
                                        M.j[] jVarArr = {c6};
                                        E2.b bVar = H.f.f1855a;
                                        E2.c.I("TypefaceCompat.createFromFontInfo");
                                        try {
                                            Typeface j = H.f.f1855a.j(context, jVarArr, 0);
                                            Trace.endSection();
                                            MappedByteBuffer g02 = E2.c.g0(tVar.f9409a, c6.f3289a);
                                            if (g02 != null && j != null) {
                                                try {
                                                    Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                                    A4.a aVar = new A4.a(j, X.L(g02));
                                                    Trace.endSection();
                                                    synchronized (tVar.f9412d) {
                                                        try {
                                                            E2.d dVar = tVar.f9416h;
                                                            if (dVar != null) {
                                                                dVar.B(aVar);
                                                            }
                                                        } finally {
                                                        }
                                                    }
                                                    tVar.b();
                                                    return;
                                                } finally {
                                                    Method method3 = L.f.f2746b;
                                                }
                                            }
                                            throw new RuntimeException("Unable to open file.");
                                        } finally {
                                            Trace.endSection();
                                        }
                                    } finally {
                                    }
                                }
                                throw new RuntimeException("fetchFonts result is not OK. (" + i10 + ")");
                            } catch (Throwable th3) {
                                synchronized (tVar.f9412d) {
                                    try {
                                        E2.d dVar2 = tVar.f9416h;
                                        if (dVar2 != null) {
                                            dVar2.A(th3);
                                        }
                                        tVar.b();
                                        return;
                                    } finally {
                                    }
                                }
                            }
                        }
                        return;
                    } finally {
                    }
                }
            case 12:
                ((com.google.android.material.timepicker.e) this.f1081e).d();
                return;
            case 13:
                AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y = (AbstractComponentCallbacksC0755y) this.f1081e;
                abstractComponentCallbacksC0755y.f11104U.f11010i.i(abstractComponentCallbacksC0755y.f11113g);
                abstractComponentCallbacksC0755y.f11113g = null;
                return;
            case 14:
                Iterator it = ((T) this.f1081e).f10912o.iterator();
                while (it.hasNext()) {
                    ((C1301i) it.next()).getClass();
                }
                return;
            case 15:
                ((CarouselLayoutManager) this.f1081e).t0();
                return;
            default:
                View view = (View) this.f1081e;
                ((InputMethodManager) view.getContext().getSystemService(InputMethodManager.class)).showSoftInput(view, 1);
                return;
        }
    }
}
