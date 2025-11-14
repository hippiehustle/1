package A4;

import C6.InterfaceC0008i;
import D4.C0027c;
import D4.C0028d;
import D4.C0037m;
import H3.v;
import K0.f;
import K3.D;
import O7.InterfaceC0233f;
import O7.InterfaceC0234g;
import O7.V;
import O7.i0;
import P7.AbstractC0285b;
import Q0.n;
import Y6.e;
import Z.g;
import Z5.y;
import a6.C0433h;
import android.content.Context;
import android.graphics.Point;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import c7.AbstractC0585d;
import com.buzbuz.smartautoclicker.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.divider.MaterialDivider;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.materialswitch.MaterialSwitch;
import com.google.android.material.slider.Slider;
import com.google.android.material.textview.MaterialTextView;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import g6.InterfaceC0789a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import o.p1;
import o6.j;
import o6.m;

/* loaded from: classes.dex */
public class c implements M0.a, InterfaceC0233f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f290d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f291e;

    /* renamed from: f, reason: collision with root package name */
    public Object f292f;

    /* renamed from: g, reason: collision with root package name */
    public Object f293g;

    public /* synthetic */ c(ViewGroup viewGroup, ImageView imageView, MaterialTextView materialTextView, int i4) {
        this.f290d = i4;
        this.f291e = viewGroup;
        this.f293g = imageView;
        this.f292f = materialTextView;
    }

    public static c a(View view) {
        int i4 = R.id.description;
        MaterialTextView materialTextView = (MaterialTextView) E2.b.r(view, R.id.description);
        if (materialTextView != null) {
            i4 = R.id.value;
            MaterialTextView materialTextView2 = (MaterialTextView) E2.b.r(view, R.id.value);
            if (materialTextView2 != null) {
                return new c((ConstraintLayout) view, materialTextView, materialTextView2, 0);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    public static c b(View view) {
        int i4 = R.id.button_copy;
        FloatingActionButton floatingActionButton = (FloatingActionButton) E2.b.r(view, R.id.button_copy);
        if (floatingActionButton != null) {
            i4 = R.id.button_new;
            FloatingActionButton floatingActionButton2 = (FloatingActionButton) E2.b.r(view, R.id.button_new);
            if (floatingActionButton2 != null) {
                return new c((LinearLayout) view, floatingActionButton, floatingActionButton2, 12);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    public static c c(View view) {
        int i4 = R.id.multi_state_button;
        View r8 = E2.b.r(view, R.id.multi_state_button);
        if (r8 != null) {
            a d2 = a.d(r8);
            View r9 = E2.b.r(view, R.id.title_and_description);
            if (r9 != null) {
                return new c((ConstraintLayout) view, d2, f(r9), 14);
            }
            i4 = R.id.title_and_description;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    public static c d(View view) {
        int i4 = R.id.chevron;
        if (((AppCompatImageView) E2.b.r(view, R.id.chevron)) != null) {
            i4 = R.id.icon;
            ImageView imageView = (ImageView) E2.b.r(view, R.id.icon);
            if (imageView != null) {
                i4 = R.id.title_and_description;
                View r8 = E2.b.r(view, R.id.title_and_description);
                if (r8 != null) {
                    return new c((ConstraintLayout) view, imageView, f(r8), 15);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    public static c e(View view) {
        int i4 = R.id.separator;
        if (((MaterialDivider) E2.b.r(view, R.id.separator)) != null) {
            i4 = R.id.title_and_description;
            View r8 = E2.b.r(view, R.id.title_and_description);
            if (r8 != null) {
                c f8 = f(r8);
                MaterialSwitch materialSwitch = (MaterialSwitch) E2.b.r(view, R.id.toggle_switch);
                if (materialSwitch != null) {
                    return new c((ConstraintLayout) view, f8, materialSwitch, 17);
                }
                i4 = R.id.toggle_switch;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    public static c f(View view) {
        int i4 = R.id.description;
        MaterialTextView materialTextView = (MaterialTextView) E2.b.r(view, R.id.description);
        if (materialTextView != null) {
            i4 = R.id.title;
            MaterialTextView materialTextView2 = (MaterialTextView) E2.b.r(view, R.id.title);
            if (materialTextView2 != null) {
                return new c((LinearLayout) view, materialTextView, materialTextView2, 19);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    public static c g(View view) {
        int i4 = R.id.dropdown_item_icon;
        ImageView imageView = (ImageView) E2.b.r(view, R.id.dropdown_item_icon);
        if (imageView != null) {
            i4 = R.id.dropdown_item_text;
            MaterialTextView materialTextView = (MaterialTextView) E2.b.r(view, R.id.dropdown_item_text);
            if (materialTextView != null) {
                return new c((ViewGroup) view, imageView, materialTextView, 20);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    public static c i(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(R.layout.dialog_base_selection, (ViewGroup) null, false);
        int i4 = R.id.layout_loadable_list;
        View r8 = E2.b.r(inflate, R.id.layout_loadable_list);
        if (r8 != null) {
            p1 a3 = p1.a(r8);
            View r9 = E2.b.r(inflate, R.id.layout_top_bar);
            if (r9 != null) {
                return new c((CoordinatorLayout) inflate, a3, d.a(r9), 6);
            }
            i4 = R.id.layout_top_bar;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
    }

    @Override // M0.a
    public View getRoot() {
        switch (this.f290d) {
            case 0:
                return (ConstraintLayout) this.f291e;
            case 1:
                return (FrameLayout) this.f291e;
            case g.FLOAT_FIELD_NUMBER /* 2 */:
            case g.INTEGER_FIELD_NUMBER /* 3 */:
            case g.LONG_FIELD_NUMBER /* 4 */:
            case 10:
            case 21:
            default:
                return (NestedScrollView) this.f291e;
            case g.STRING_FIELD_NUMBER /* 5 */:
                return (NestedScrollView) this.f291e;
            case g.STRING_SET_FIELD_NUMBER /* 6 */:
                return (CoordinatorLayout) this.f291e;
            case g.DOUBLE_FIELD_NUMBER /* 7 */:
                return (ConstraintLayout) this.f291e;
            case g.BYTES_FIELD_NUMBER /* 8 */:
                return (MaterialCardView) this.f291e;
            case 9:
                return (MaterialCardView) this.f291e;
            case 11:
                return (MaterialButtonToggleGroup) this.f291e;
            case 12:
                return (LinearLayout) this.f291e;
            case 13:
                return (ConstraintLayout) this.f291e;
            case 14:
                return (ConstraintLayout) this.f291e;
            case 15:
                return (ConstraintLayout) this.f291e;
            case 16:
                return (ConstraintLayout) this.f291e;
            case 17:
                return (ConstraintLayout) this.f291e;
            case 18:
                return (FrameLayout) this.f291e;
            case 19:
                return (LinearLayout) this.f291e;
            case 20:
                return (LinearLayout) this.f291e;
            case 22:
                return (MaterialCardView) this.f291e;
        }
    }

    public Object h() {
        C0433h c0433h = (C0433h) this.f291e;
        if (!c0433h.isEmpty()) {
            return c0433h.last();
        }
        return null;
    }

    public Object j() {
        Object obj;
        C0433h c0433h = (C0433h) this.f291e;
        Object removeLast = c0433h.removeLast();
        i0 i0Var = (i0) this.f292f;
        if (!c0433h.isEmpty()) {
            obj = c0433h.last();
        } else {
            obj = null;
        }
        i0Var.g(obj);
        return removeLast;
    }

    public void k(boolean z8) {
        f fVar = (f) this.f292f;
        ImageButton imageButton = (ImageButton) this.f293g;
        if (imageButton != null) {
            if (z8) {
                imageButton.setImageDrawable(fVar);
                fVar.start();
            } else {
                imageButton.setImageResource(R.drawable.ic_play_arrow);
            }
        }
    }

    public void l(boolean z8) {
        f fVar = (f) this.f291e;
        ImageButton imageButton = (ImageButton) this.f293g;
        if (imageButton != null) {
            if (z8) {
                imageButton.setImageDrawable(fVar);
                fVar.start();
            } else {
                imageButton.setImageResource(R.drawable.ic_pause);
            }
        }
    }

    @Override // O7.InterfaceC0233f
    public Object x(InterfaceC0234g interfaceC0234g, InterfaceC0617c interfaceC0617c) {
        int i4 = this.f290d;
        int i8 = 1;
        int i9 = 0;
        y yVar = y.f7506a;
        EnumC0646a enumC0646a = EnumC0646a.f10656d;
        Object obj = this.f291e;
        switch (i4) {
            case g.LONG_FIELD_NUMBER /* 4 */:
                Object x8 = ((InterfaceC0233f) obj).x(new C0027c(interfaceC0234g, (C0028d) this.f292f, (Context) this.f293g, i9), interfaceC0617c);
                if (x8 == enumC0646a) {
                    return x8;
                }
                return yVar;
            case 25:
                Object x9 = ((v) obj).x(new C0027c(interfaceC0234g, (D) this.f292f, (Context) this.f293g, i8), interfaceC0617c);
                if (x9 == enumC0646a) {
                    return x9;
                }
                return yVar;
            default:
                Object a3 = AbstractC0285b.a(interfaceC0234g, interfaceC0617c, new C0037m(this.f293g, (InterfaceC0617c) null, 3), new InterfaceC0233f[]{(InterfaceC0233f) obj, (InterfaceC0233f) this.f292f});
                if (a3 == enumC0646a) {
                    return a3;
                }
                return yVar;
        }
    }

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, int i4) {
        this.f290d = i4;
        this.f291e = obj;
        this.f292f = obj2;
        this.f293g = obj3;
    }

    public c(m mVar, AbstractC0585d abstractC0585d, InterfaceC0789a interfaceC0789a, ArrayList arrayList) {
        this.f290d = 26;
        j.e(abstractC0585d, "protoSet");
        j.e(interfaceC0789a, "entries");
        this.f291e = mVar;
        this.f292f = abstractC0585d;
        this.f293g = interfaceC0789a;
    }

    public c(List list) {
        this.f290d = 29;
        this.f293g = list;
        this.f291e = new ArrayList(list.size());
        this.f292f = new ArrayList(list.size());
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((ArrayList) this.f291e).add(new n((List) ((U0.f) list.get(i4)).f5965b.f1023e));
            ((ArrayList) this.f292f).add(((U0.f) list.get(i4)).f5966c.r0());
        }
    }

    public c(e eVar, W0.c cVar) {
        this.f290d = 21;
        this.f291e = eVar;
        this.f292f = cVar;
        this.f293g = new ConcurrentHashMap();
    }

    public c() {
        this.f290d = 2;
        this.f291e = new C0433h((Object) null);
        i0 c6 = V.c(null);
        this.f292f = c6;
        this.f293g = c6;
    }

    public c(A1.e eVar) {
        this.f290d = 10;
        this.f291e = eVar;
        this.f292f = new Point(0, 0);
        this.f293g = new Point(0, 0);
    }

    public c(Context context) {
        this.f290d = 24;
        this.f291e = f.a(context, R.drawable.anim_play_pause);
        this.f292f = f.a(context, R.drawable.anim_pause_play);
    }

    public c(ConstraintLayout constraintLayout, Slider slider, MaterialTextView materialTextView, MaterialTextView materialTextView2) {
        this.f290d = 16;
        this.f291e = constraintLayout;
        this.f293g = slider;
        this.f292f = materialTextView2;
    }

    public c(NestedScrollView nestedScrollView, MaterialButton materialButton, MaterialButton materialButton2, MaterialTextView materialTextView, MaterialTextView materialTextView2) {
        this.f290d = 23;
        this.f291e = nestedScrollView;
        this.f292f = materialTextView;
        this.f293g = materialTextView2;
    }

    public c(InterfaceC0008i interfaceC0008i, List list, c cVar) {
        this.f290d = 3;
        j.e(interfaceC0008i, "classifierDescriptor");
        j.e(list, "arguments");
        this.f291e = interfaceC0008i;
        this.f292f = list;
        this.f293g = cVar;
    }

    public c(Runnable runnable) {
        this.f290d = 28;
        this.f292f = new CopyOnWriteArrayList();
        this.f293g = new HashMap();
        this.f291e = runnable;
    }

    public c(FrameLayout frameLayout, Slider slider, TextView textView, TextView textView2) {
        this.f290d = 1;
        this.f291e = frameLayout;
        this.f292f = textView;
        this.f293g = textView2;
    }
}
