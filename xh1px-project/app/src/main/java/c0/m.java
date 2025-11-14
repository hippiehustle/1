package c0;

import android.view.View;
import android.view.ViewGroup;
import g0.C0737f;
import g0.g0;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public final /* synthetic */ class m implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9396d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f9397e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f9398f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f9399g;

    public /* synthetic */ m(Object obj, Object obj2, Object obj3, int i4) {
        this.f9396d = i4;
        this.f9397e = obj;
        this.f9398f = obj2;
        this.f9399g = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9396d) {
            case 0:
                o oVar = (o) this.f9397e;
                E2.d dVar = (E2.d) this.f9398f;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f9399g;
                try {
                    u R5 = E2.c.R(oVar.f9402a);
                    if (R5 != null) {
                        t tVar = (t) ((j) R5.f9383b);
                        synchronized (tVar.f9412d) {
                            tVar.f9414f = threadPoolExecutor;
                        }
                        ((j) R5.f9383b).a(new n(dVar, threadPoolExecutor));
                        return;
                    }
                    throw new RuntimeException("EmojiCompat font provider not available on this device.");
                } catch (Throwable th) {
                    dVar.A(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
            default:
                ViewGroup viewGroup = (ViewGroup) this.f9397e;
                View view = (View) this.f9398f;
                C0737f c0737f = (C0737f) this.f9399g;
                o6.j.e(viewGroup, "$container");
                o6.j.e(c0737f, "this$0");
                viewGroup.endViewTransition(view);
                ((g0) c0737f.f11016c.f1023e).c(c0737f);
                return;
        }
    }
}
