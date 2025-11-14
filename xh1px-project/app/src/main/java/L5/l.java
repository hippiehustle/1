package L5;

import O7.i0;
import P.D;
import P.O;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import com.buzbuz.smartautoclicker.scenarios.list.ScenarioListFragment;
import java.util.WeakHashMap;
import n.ViewOnKeyListenerC1102D;
import n.ViewOnKeyListenerC1110g;

/* loaded from: classes.dex */
public final class l implements View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2964d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2965e;

    public /* synthetic */ l(int i4, Object obj) {
        this.f2964d = i4;
        this.f2965e = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i4 = this.f2964d;
        Object obj = this.f2965e;
        switch (i4) {
            case 0:
                n nVar = (n) obj;
                AccessibilityManager accessibilityManager = nVar.f2987w;
                if (nVar.f2988x != null && accessibilityManager != null) {
                    WeakHashMap weakHashMap = O.f4214a;
                    if (nVar.isAttachedToWindow()) {
                        accessibilityManager.addTouchExplorationStateChangeListener(new Q.b(nVar.f2988x));
                        return;
                    }
                    return;
                }
                return;
            case 1:
                o6.j.e(view, "arg0");
                ((i0) ((ScenarioListFragment) obj).S().f6625b.f281f).g("");
                return;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                View view2 = (View) obj;
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap2 = O.f4214a;
                D.c(view2);
                return;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
            default:
                return;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        switch (this.f2964d) {
            case 0:
                n nVar = (n) this.f2965e;
                B1.b bVar = nVar.f2988x;
                if (bVar != null && (accessibilityManager = nVar.f2987w) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(new Q.b(bVar));
                    return;
                }
                return;
            case 1:
                o6.j.e(view, "arg0");
                ScenarioListFragment scenarioListFragment = (ScenarioListFragment) this.f2965e;
                ((i0) scenarioListFragment.S().f6625b.f281f).g(null);
                scenarioListFragment.S().e(Z4.q.f7464d);
                return;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                return;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                ViewOnKeyListenerC1110g viewOnKeyListenerC1110g = (ViewOnKeyListenerC1110g) this.f2965e;
                ViewTreeObserver viewTreeObserver = viewOnKeyListenerC1110g.f12603A;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        viewOnKeyListenerC1110g.f12603A = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC1110g.f12603A.removeGlobalOnLayoutListener(viewOnKeyListenerC1110g.f12611l);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            default:
                ViewOnKeyListenerC1102D viewOnKeyListenerC1102D = (ViewOnKeyListenerC1102D) this.f2965e;
                ViewTreeObserver viewTreeObserver2 = viewOnKeyListenerC1102D.f12569r;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        viewOnKeyListenerC1102D.f12569r = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC1102D.f12569r.removeGlobalOnLayoutListener(viewOnKeyListenerC1102D.f12563l);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
        }
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }
}
