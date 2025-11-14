package J0;

import android.view.ViewGroup;
import com.buzbuz.smartautoclicker.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public static final C0067a f2338a = new C0067a();

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f2339b = new ThreadLocal();

    /* renamed from: c, reason: collision with root package name */
    public static final ArrayList f2340c = new ArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [android.view.ViewTreeObserver$OnPreDrawListener, J0.s, java.lang.Object, android.view.View$OnAttachStateChangeListener] */
    public static void a(ViewGroup viewGroup, p pVar) {
        ArrayList arrayList = f2340c;
        if (!arrayList.contains(viewGroup) && viewGroup.isLaidOut()) {
            arrayList.add(viewGroup);
            if (pVar == null) {
                pVar = f2338a;
            }
            p clone = pVar.clone();
            ArrayList arrayList2 = (ArrayList) b().get(viewGroup);
            if (arrayList2 != null && arrayList2.size() > 0) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((p) it.next()).x(viewGroup);
                }
            }
            clone.h(viewGroup, true);
            if (viewGroup.getTag(R.id.transition_current_scene) == null) {
                viewGroup.setTag(R.id.transition_current_scene, null);
                ?? obj = new Object();
                obj.f2336d = clone;
                obj.f2337e = viewGroup;
                viewGroup.addOnAttachStateChangeListener(obj);
                viewGroup.getViewTreeObserver().addOnPreDrawListener(obj);
                return;
            }
            throw new ClassCastException();
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [t.j, t.e, java.lang.Object] */
    public static t.e b() {
        t.e eVar;
        ThreadLocal threadLocal = f2339b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (eVar = (t.e) weakReference.get()) != null) {
            return eVar;
        }
        ?? jVar = new t.j(0);
        threadLocal.set(new WeakReference(jVar));
        return jVar;
    }
}
