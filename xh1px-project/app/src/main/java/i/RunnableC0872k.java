package i;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p.ExecutorC1289a;
import t.C1523a;

/* renamed from: i.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0872k implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11715d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f11716e;

    public /* synthetic */ RunnableC0872k(Context context, int i4) {
        this.f11715d = i4;
        this.f11716e = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x008b, code lost:
    
        if (r2 != null) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009a  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        L.d dVar;
        Object obj;
        Context context;
        switch (this.f11715d) {
            case 0:
                int i4 = Build.VERSION.SDK_INT;
                if (i4 >= 33) {
                    Context context2 = this.f11716e;
                    ComponentName componentName = new ComponentName(context2, "androidx.appcompat.app.AppLocalesMetadataHolderService");
                    if (context2.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                        if (i4 >= 33) {
                            t.f fVar = AbstractC0877p.j;
                            fVar.getClass();
                            C1523a c1523a = new C1523a(fVar);
                            while (true) {
                                if (c1523a.hasNext()) {
                                    AbstractC0877p abstractC0877p = (AbstractC0877p) ((WeakReference) c1523a.next()).get();
                                    if (abstractC0877p != null && (context = ((LayoutInflaterFactory2C0860C) abstractC0877p).f11584n) != null) {
                                        obj = context.getSystemService("locale");
                                    }
                                } else {
                                    obj = null;
                                }
                            }
                            if (obj != null) {
                                dVar = new L.d(new L.e(AbstractC0874m.a(obj)));
                                if (dVar.f2743a.f2744a.isEmpty()) {
                                    String e9 = E.e.e(context2);
                                    Object systemService = context2.getSystemService("locale");
                                    if (systemService != null) {
                                        AbstractC0874m.b(systemService, AbstractC0873l.a(e9));
                                    }
                                }
                                context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                            }
                            dVar = L.d.f2742b;
                            if (dVar.f2743a.f2744a.isEmpty()) {
                            }
                            context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                        } else {
                            dVar = AbstractC0877p.f11724f;
                            break;
                        }
                    }
                }
                AbstractC0877p.f11727i = true;
                return;
            case 1:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new RunnableC0872k(this.f11716e, 2));
                return;
            default:
                r0.e.t(this.f11716e, new ExecutorC1289a(1), r0.e.f14239a, false);
                return;
        }
    }
}
