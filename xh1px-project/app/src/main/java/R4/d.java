package R4;

import L7.X;
import N3.l;
import N3.m;
import Z3.AbstractC0375j;
import Z3.AbstractC0379n;
import Z3.C0373h;
import Z3.C0374i;
import Z3.C0377l;
import Z3.C0378m;
import Z3.o;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import c4.C0574a;
import c4.C0575b;
import com.buzbuz.smartautoclicker.R;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.divider.MaterialDivider;
import com.google.android.material.textview.MaterialTextView;
import d1.C0594a;
import e4.C0643a;
import f2.n;
import f4.C0709b;
import g4.C0780b;
import h6.AbstractC0837b;
import j2.C0902b;
import k3.AbstractC0961h;
import k3.C0954a;
import k3.C0959f;
import k3.C0960g;
import k3.C0966m;
import k3.C0967n;
import kotlin.NoWhenBranchMatchedException;
import m4.C1087a;
import m4.p;
import n6.InterfaceC1163b;
import n6.InterfaceC1164c;
import o.p1;
import q4.C1395a;
import q4.C1396b;
import q4.C1397c;
import r2.C1429a;
import r4.C1461a;
import r4.C1467g;
import r4.C1468h;
import r4.j;
import r4.k;
import r4.q;
import s3.AbstractC1492c;
import t0.L;
import t0.s0;
import u6.AbstractC1638C;
import w4.C1696a;
import w4.C1707l;

/* loaded from: classes.dex */
public final class d extends L {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5125e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final Z5.d f5126f;

    public d(A1.e eVar) {
        super(b.f5123d);
        this.f5126f = eVar;
    }

    @Override // t0.U
    public int c(int i4) {
        switch (this.f5125e) {
            case 1:
                N3.g gVar = (N3.g) g(i4);
                if (gVar instanceof N3.f) {
                    return R.layout.item_list_header;
                }
                if (gVar instanceof N3.e) {
                    return R.layout.item_action;
                }
                throw new NoWhenBranchMatchedException();
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                AbstractC0375j abstractC0375j = (AbstractC0375j) g(i4);
                if (abstractC0375j instanceof C0373h) {
                    return R.layout.item_list_header;
                }
                if (abstractC0375j instanceof C0374i) {
                    return R.layout.item_event_toggle;
                }
                throw new NoWhenBranchMatchedException();
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                AbstractC0961h abstractC0961h = (AbstractC0961h) g(i4);
                if (abstractC0961h instanceof C0960g) {
                    return R.layout.item_list_header;
                }
                if (abstractC0961h instanceof C0959f) {
                    return R.layout.item_dumb_action;
                }
                throw new NoWhenBranchMatchedException();
            case 10:
                k kVar = (k) g(i4);
                if (kVar instanceof j) {
                    return R.layout.item_list_header;
                }
                if (kVar instanceof C1467g) {
                    return R.layout.item_image_event;
                }
                if (kVar instanceof C1468h) {
                    return R.layout.item_trigger_event;
                }
                throw new NoWhenBranchMatchedException();
            default:
                return super.c(i4);
        }
    }

    @Override // t0.U
    public final void d(s0 s0Var, int i4) {
        int i8;
        int i9;
        Integer num;
        int i10;
        switch (this.f5125e) {
            case 0:
                Object g8 = g(i4);
                o6.j.d(g8, "getItem(...)");
                a aVar = (a) g8;
                A1.e eVar = (A1.e) this.f5126f;
                o6.j.e(eVar, "onGameClicked");
                A4.c cVar = ((c) s0Var).f5124u;
                ((MaterialTextView) cVar.f293g).setText(aVar.f5120a);
                ((MaterialTextView) cVar.f292f).setText(aVar.f5121b);
                ((MaterialCardView) cVar.f291e).setOnClickListener(new D2.a(eVar, 6, aVar));
                return;
            case 1:
                if (s0Var instanceof m) {
                    Object g9 = g(i4);
                    o6.j.c(g9, "null cannot be cast to non-null type com.buzbuz.smartautoclicker.feature.smart.config.ui.action.copy.ActionCopyModel.ActionCopyItem.HeaderItem");
                    ((MaterialTextView) ((m) s0Var).f3759u.f89f).setText(((N3.f) g9).f3749a);
                    return;
                }
                if (s0Var instanceof N3.k) {
                    Object g10 = g(i4);
                    o6.j.c(g10, "null cannot be cast to non-null type com.buzbuz.smartautoclicker.feature.smart.config.ui.action.copy.ActionCopyModel.ActionCopyItem.ActionItem");
                    N3.e eVar2 = (N3.e) g10;
                    A1.h hVar = (A1.h) this.f5126f;
                    o6.j.e(hVar, "actionClickedListener");
                    F3.h hVar2 = ((N3.k) s0Var).f3757u;
                    hVar2.f1348e.setOnClickListener(new D2.a(hVar, 3, eVar2));
                    MaterialTextView materialTextView = hVar2.f1350g;
                    materialTextView.setVisibility(0);
                    ImageView imageView = hVar2.f1351h;
                    C0643a c0643a = eVar2.f3748a;
                    imageView.setImageResource(c0643a.f10606a);
                    materialTextView.setText(c0643a.f10607b);
                    MaterialTextView materialTextView2 = hVar2.f1349f;
                    materialTextView2.setText(c0643a.f10608c);
                    TypedValue typedValue = new TypedValue();
                    if (c0643a.f10610e) {
                        i8 = R.attr.colorError;
                    } else {
                        i8 = R.attr.colorOnSurfaceVariant;
                    }
                    hVar2.f1348e.getContext().getTheme().resolveAttribute(i8, typedValue, true);
                    materialTextView2.setTextColor(typedValue.data);
                    return;
                }
                return;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                P3.i iVar = (P3.i) s0Var;
                Object g11 = g(i4);
                o6.j.d(g11, "getItem(...)");
                C0594a c0594a = (C0594a) g11;
                A4.c cVar2 = iVar.f4513u;
                InterfaceC1163b interfaceC1163b = iVar.f4514v;
                o6.j.e(cVar2, "<this>");
                ((MaterialTextView) cVar2.f292f).setText(c0594a.f10365b);
                ((ImageView) cVar2.f293g).setImageDrawable(c0594a.f10366c);
                if (interfaceC1163b != null) {
                    ((ConstraintLayout) cVar2.f291e).setOnClickListener(new D2.a(interfaceC1163b, 7, c0594a));
                    return;
                }
                return;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                Q3.i iVar2 = (Q3.i) s0Var;
                Object g12 = g(i4);
                o6.j.d(g12, "getItem(...)");
                C0594a c0594a2 = (C0594a) g12;
                F3.h hVar3 = iVar2.f4855u;
                hVar3.f1351h.setImageDrawable(c0594a2.f10366c);
                hVar3.f1349f.setText(c0594a2.f10365b);
                hVar3.f1350g.setText(c0594a2.f10364a.getPackageName());
                hVar3.f1348e.setOnClickListener(new D2.a(iVar2, 5, c0594a2));
                return;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                X4.e eVar3 = (X4.e) s0Var;
                Object g13 = g(i4);
                o6.j.d(g13, "getItem(...)");
                Z4.f fVar = (Z4.f) g13;
                A4.d dVar = eVar3.f6954u;
                ((MaterialTextView) dVar.f299i).setText(fVar.f7434b);
                ((MaterialTextView) dVar.f298h).setText(String.valueOf(fVar.f7435c));
                ((MaterialTextView) dVar.f297g).setText(String.valueOf(fVar.f7436d));
                C0902b c0902b = fVar.f7437e;
                if (c0902b == null) {
                    ImageView imageView2 = (ImageView) dVar.f296f;
                    Drawable drawable = ((MaterialCardView) dVar.f295e).getContext().getDrawable(R.drawable.ic_cancel);
                    if (drawable != null) {
                        drawable.setTint(-65536);
                    } else {
                        drawable = null;
                    }
                    imageView2.setImageDrawable(drawable);
                    return;
                }
                eVar3.f6956w = (X) eVar3.f6955v.l(c0902b, new M7.c(dVar, 9, eVar3));
                return;
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                if (s0Var instanceof C0377l) {
                    Object g14 = g(i4);
                    o6.j.c(g14, "null cannot be cast to non-null type com.buzbuz.smartautoclicker.feature.smart.config.ui.action.toggleevent.EventTogglesListItem.Header");
                    ((MaterialTextView) ((C0377l) s0Var).f7388u.f89f).setText(((C0373h) g14).f7379a);
                    return;
                }
                if (s0Var instanceof o) {
                    o oVar = (o) s0Var;
                    Object g15 = g(i4);
                    o6.j.c(g15, "null cannot be cast to non-null type com.buzbuz.smartautoclicker.feature.smart.config.ui.action.toggleevent.EventTogglesListItem.Item");
                    C0374i c0374i = (C0374i) g15;
                    A4.d dVar2 = oVar.f7392u;
                    ((TextView) dVar2.f296f).setText(c0374i.f7381b);
                    ((TextView) dVar2.f297g).setText(String.valueOf(c0374i.f7382c));
                    ((TextView) dVar2.f298h).setText(String.valueOf(c0374i.f7383d));
                    A4.a aVar2 = (A4.a) dVar2.f299i;
                    n nVar = c0374i.f7384e;
                    if (nVar == null) {
                        i9 = -1;
                    } else {
                        i9 = AbstractC0379n.f7390a[nVar.ordinal()];
                    }
                    if (i9 != 1) {
                        if (i9 != 2) {
                            if (i9 != 3) {
                                num = null;
                            } else {
                                num = 2;
                            }
                        } else {
                            num = 1;
                        }
                    } else {
                        num = 0;
                    }
                    E2.c.n0(aVar2, num);
                    E2.c.v0(aVar2, new M7.c(oVar, 10, c0374i));
                    return;
                }
                return;
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                c4.i iVar3 = (c4.i) s0Var;
                Object g16 = g(i4);
                o6.j.d(g16, "getItem(...)");
                String str = (String) g16;
                A.i iVar4 = iVar3.f9665u;
                ((MaterialTextView) iVar4.f89f).setText(str);
                ((FrameLayout) iVar4.f88e).setOnClickListener(new D2.a(iVar3, 13, str));
                return;
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                if (s0Var instanceof C0967n) {
                    Object g17 = g(i4);
                    o6.j.c(g17, "null cannot be cast to non-null type com.buzbuz.smartautoclicker.feature.dumb.config.ui.actions.copy.DumbActionCopyItem.HeaderItem");
                    ((MaterialTextView) ((C0967n) s0Var).f12005u.f89f).setText(((C0960g) g17).f11989a);
                    return;
                } else {
                    if (s0Var instanceof C0966m) {
                        Object g18 = g(i4);
                        o6.j.c(g18, "null cannot be cast to non-null type com.buzbuz.smartautoclicker.feature.dumb.config.ui.actions.copy.DumbActionCopyItem.DumbActionItem");
                        C0959f c0959f = (C0959f) g18;
                        A1.h hVar4 = (A1.h) this.f5126f;
                        o6.j.e(hVar4, "actionClickedListener");
                        AbstractC0837b.q(((C0966m) s0Var).f12004u, c0959f.f11988a, false, new M7.c(hVar4, 12, c0959f));
                        return;
                    }
                    return;
                }
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                Object g19 = g(i4);
                o6.j.d(g19, "getItem(...)");
                W4.i iVar5 = (W4.i) this.f5126f;
                o6.j.e(iVar5, "conditionClickedListener");
                AbstractC1638C.j(((p) s0Var).f12524u, (C0709b) g19, iVar5);
                return;
            case 9:
                C1396b c1396b = (C1396b) s0Var;
                Object g20 = g(i4);
                o6.j.d(g20, "getItem(...)");
                C1397c c1397c = (C1397c) g20;
                A4.c cVar3 = c1396b.f14093u;
                ((ImageView) cVar3.f292f).setImageResource(c1397c.f14095a);
                ImageView imageView3 = (ImageView) cVar3.f293g;
                if (c1397c.f14096b) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                imageView3.setVisibility(i10);
                ((MaterialCardView) cVar3.f291e).setOnClickListener(new B2.b(14, c1396b));
                return;
            case 10:
                C1429a c1429a = (C1429a) this.f5126f;
                if (s0Var instanceof r4.o) {
                    Object g21 = g(i4);
                    o6.j.c(g21, "null cannot be cast to non-null type com.buzbuz.smartautoclicker.feature.smart.config.ui.event.copy.EventCopyModel.EventCopyItem.Header");
                    ((MaterialTextView) ((r4.o) s0Var).f14409u.f89f).setText(((j) g21).f14400a);
                    return;
                } else {
                    if (s0Var instanceof r4.p) {
                        Object g22 = g(i4);
                        o6.j.c(g22, "null cannot be cast to non-null type com.buzbuz.smartautoclicker.feature.smart.config.ui.event.copy.EventCopyModel.EventCopyItem.EventItem.Image");
                        o6.j.e(c1429a, "eventClickedListener");
                        AbstractC1492c.d(((r4.p) s0Var).f14410u, ((C1467g) g22).f14396b, false, c1429a);
                        return;
                    }
                    if (s0Var instanceof q) {
                        Object g23 = g(i4);
                        o6.j.c(g23, "null cannot be cast to non-null type com.buzbuz.smartautoclicker.feature.smart.config.ui.event.copy.EventCopyModel.EventCopyItem.EventItem.Trigger");
                        o6.j.e(c1429a, "eventClickedListener");
                        D2.f.c(((q) s0Var).f14411u, ((C1468h) g23).f14399b, c1429a);
                        return;
                    }
                    return;
                }
            default:
                Object g24 = g(i4);
                o6.j.d(g24, "getItem(...)");
                u4.d dVar3 = (u4.d) this.f5126f;
                o6.j.e(dVar3, "itemClickedListener");
                D2.f.c(((C1707l) s0Var).f15711u, (C0780b) g24, dVar3);
                return;
        }
    }

    @Override // t0.U
    public final s0 e(ViewGroup viewGroup, int i4) {
        switch (this.f5125e) {
            case 0:
                View h8 = A.j.h(viewGroup, R.layout.item_tutorial, viewGroup, false);
                int i8 = R.id.choice_description;
                MaterialTextView materialTextView = (MaterialTextView) E2.b.r(h8, R.id.choice_description);
                if (materialTextView != null) {
                    i8 = R.id.choice_title;
                    MaterialTextView materialTextView2 = (MaterialTextView) E2.b.r(h8, R.id.choice_title);
                    if (materialTextView2 != null) {
                        i8 = R.id.click_selector_chevron;
                        if (((ImageView) E2.b.r(h8, R.id.click_selector_chevron)) != null) {
                            return new c(new A4.c((MaterialCardView) h8, materialTextView, materialTextView2, 22));
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(h8.getResources().getResourceName(i8)));
            case 1:
                if (i4 == R.layout.item_list_header) {
                    return new m(A.i.e(LayoutInflater.from(viewGroup.getContext()), viewGroup));
                }
                if (i4 == R.layout.item_action) {
                    View h9 = A.j.h(viewGroup, R.layout.item_action, viewGroup, false);
                    int i9 = R.id.action_details;
                    MaterialTextView materialTextView3 = (MaterialTextView) E2.b.r(h9, R.id.action_details);
                    if (materialTextView3 != null) {
                        i9 = R.id.action_name;
                        MaterialTextView materialTextView4 = (MaterialTextView) E2.b.r(h9, R.id.action_name);
                        if (materialTextView4 != null) {
                            i9 = R.id.action_type_icon;
                            ImageView imageView = (ImageView) E2.b.r(h9, R.id.action_type_icon);
                            if (imageView != null) {
                                return new N3.k(new F3.h((ConstraintLayout) h9, materialTextView3, materialTextView4, imageView, 0));
                            }
                        }
                    }
                    throw new NullPointerException("Missing required view with ID: ".concat(h9.getResources().getResourceName(i9)));
                }
                throw new IllegalArgumentException("Unsupported view type !");
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                View h10 = A.j.h(viewGroup, R.layout.item_application, viewGroup, false);
                int i10 = R.id.icon_app;
                ImageView imageView2 = (ImageView) E2.b.r(h10, R.id.icon_app);
                if (imageView2 != null) {
                    i10 = R.id.text_app;
                    MaterialTextView materialTextView5 = (MaterialTextView) E2.b.r(h10, R.id.text_app);
                    if (materialTextView5 != null) {
                        return new P3.i(new A4.c((ViewGroup) h10, imageView2, materialTextView5, 7), (P3.a) this.f5126f);
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(h10.getResources().getResourceName(i10)));
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                View h11 = A.j.h(viewGroup, R.layout.item_component_name, viewGroup, false);
                int i11 = R.id.app_name;
                MaterialTextView materialTextView6 = (MaterialTextView) E2.b.r(h11, R.id.app_name);
                if (materialTextView6 != null) {
                    i11 = R.id.component_name;
                    MaterialTextView materialTextView7 = (MaterialTextView) E2.b.r(h11, R.id.component_name);
                    if (materialTextView7 != null) {
                        i11 = R.id.icon_app;
                        ImageView imageView3 = (ImageView) E2.b.r(h11, R.id.icon_app);
                        if (imageView3 != null) {
                            return new Q3.i(new F3.h((ConstraintLayout) h11, materialTextView6, materialTextView7, imageView3, 1), (Q3.b) this.f5126f);
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(h11.getResources().getResourceName(i11)));
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                View h12 = A.j.h(viewGroup, R.layout.item_event_card, viewGroup, false);
                int i12 = R.id.condition_image;
                ImageView imageView4 = (ImageView) E2.b.r(h12, R.id.condition_image);
                if (imageView4 != null) {
                    i12 = R.id.divider;
                    if (((MaterialDivider) E2.b.r(h12, R.id.divider)) != null) {
                        i12 = R.id.event_actions_count;
                        MaterialTextView materialTextView8 = (MaterialTextView) E2.b.r(h12, R.id.event_actions_count);
                        if (materialTextView8 != null) {
                            i12 = R.id.event_conditions_count;
                            MaterialTextView materialTextView9 = (MaterialTextView) E2.b.r(h12, R.id.event_conditions_count);
                            if (materialTextView9 != null) {
                                i12 = R.id.event_name;
                                MaterialTextView materialTextView10 = (MaterialTextView) E2.b.r(h12, R.id.event_name);
                                if (materialTextView10 != null) {
                                    return new X4.e(new A4.d((MaterialCardView) h12, imageView4, materialTextView8, materialTextView9, materialTextView10), (InterfaceC1164c) this.f5126f);
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(h12.getResources().getResourceName(i12)));
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                if (i4 == R.layout.item_list_header) {
                    return new C0377l(A.i.e(LayoutInflater.from(viewGroup.getContext()), viewGroup));
                }
                if (i4 == R.layout.item_event_toggle) {
                    View h13 = A.j.h(viewGroup, R.layout.item_event_toggle, viewGroup, false);
                    int i13 = R.id.action_count;
                    if (((ImageView) E2.b.r(h13, R.id.action_count)) != null) {
                        i13 = R.id.condition_count;
                        if (((ImageView) E2.b.r(h13, R.id.condition_count)) != null) {
                            i13 = R.id.event_name;
                            TextView textView = (TextView) E2.b.r(h13, R.id.event_name);
                            if (textView != null) {
                                ConstraintLayout constraintLayout = (ConstraintLayout) h13;
                                i13 = R.id.text_actions_count;
                                TextView textView2 = (TextView) E2.b.r(h13, R.id.text_actions_count);
                                if (textView2 != null) {
                                    i13 = R.id.text_condition_count;
                                    TextView textView3 = (TextView) E2.b.r(h13, R.id.text_condition_count);
                                    if (textView3 != null) {
                                        i13 = R.id.toggle_type_button;
                                        View r8 = E2.b.r(h13, R.id.toggle_type_button);
                                        if (r8 != null) {
                                            return new o(new A4.d(constraintLayout, textView, textView2, textView3, A4.a.d(r8), 4), (A1.o) this.f5126f);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    throw new NullPointerException("Missing required view with ID: ".concat(h13.getResources().getResourceName(i13)));
                }
                throw new IllegalArgumentException(A.j.l("Unsupported view type ", i4));
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                View h14 = A.j.h(viewGroup, R.layout.item_counter_name, viewGroup, false);
                MaterialTextView materialTextView11 = (MaterialTextView) E2.b.r(h14, R.id.text_counter_name);
                if (materialTextView11 != null) {
                    return new c4.i(new A.i((FrameLayout) h14, 5, materialTextView11), (C0575b) this.f5126f);
                }
                throw new NullPointerException("Missing required view with ID: ".concat(h14.getResources().getResourceName(R.id.text_counter_name)));
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                if (i4 == R.layout.item_list_header) {
                    return new C0967n(A.i.e(LayoutInflater.from(viewGroup.getContext()), viewGroup));
                }
                if (i4 == R.layout.item_dumb_action) {
                    return new C0966m(F3.a.u(LayoutInflater.from(viewGroup.getContext()), viewGroup));
                }
                throw new IllegalArgumentException("Unsupported view type !");
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                return new p(F3.h.a(LayoutInflater.from(viewGroup.getContext()), viewGroup));
            case 9:
                View h15 = A.j.h(viewGroup, R.layout.item_event_child_description, viewGroup, false);
                int i14 = R.id.condition_image;
                ImageView imageView5 = (ImageView) E2.b.r(h15, R.id.condition_image);
                if (imageView5 != null) {
                    i14 = R.id.error_badge;
                    ImageView imageView6 = (ImageView) E2.b.r(h15, R.id.error_badge);
                    if (imageView6 != null) {
                        return new C1396b(new A4.c((MaterialCardView) h15, imageView5, imageView6, 8), (InterfaceC1163b) this.f5126f);
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(h15.getResources().getResourceName(i14)));
            case 10:
                if (i4 == R.layout.item_list_header) {
                    return new r4.o(A.i.e(LayoutInflater.from(viewGroup.getContext()), viewGroup));
                }
                if (i4 == R.layout.item_image_event) {
                    return new r4.p(F3.d.a(LayoutInflater.from(viewGroup.getContext()), viewGroup));
                }
                if (i4 == R.layout.item_trigger_event) {
                    return new q(p1.d(LayoutInflater.from(viewGroup.getContext()), viewGroup));
                }
                throw new IllegalArgumentException("Unsupported view type !");
            default:
                return new C1707l(p1.d(LayoutInflater.from(viewGroup.getContext()), viewGroup));
        }
    }

    @Override // t0.U
    public void f(s0 s0Var) {
        switch (this.f5125e) {
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                X4.e eVar = (X4.e) s0Var;
                o6.j.e(eVar, "holder");
                X x8 = eVar.f6956w;
                if (x8 != null) {
                    x8.d(null);
                }
                eVar.f6956w = null;
                return;
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                o6.j.e(s0Var, "holder");
                if (s0Var instanceof o) {
                    A4.a aVar = (A4.a) ((o) s0Var).f7392u.f299i;
                    o6.j.d(aVar, "toggleTypeButton");
                    E2.c.v0(aVar, null);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public d(C0575b c0575b) {
        super(C0574a.f9649d);
        this.f5126f = c0575b;
    }

    public d(InterfaceC1163b interfaceC1163b) {
        super(C1395a.f14090e);
        this.f5126f = interfaceC1163b;
    }

    public d(A1.h hVar, byte b4) {
        super(C0954a.f11975d);
        this.f5126f = hVar;
    }

    public d(Q3.b bVar) {
        super(Q3.a.f4839d);
        this.f5126f = bVar;
    }

    public d(u4.d dVar) {
        super(C1696a.f15687d);
        this.f5126f = dVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(InterfaceC1164c interfaceC1164c) {
        super(X4.f.f6957e);
        o6.j.e(interfaceC1164c, "bitmapProvider");
        this.f5126f = interfaceC1164c;
    }

    public d(A1.h hVar) {
        super(l.f3758d);
        this.f5126f = hVar;
    }

    public d(A1.o oVar) {
        super(C0378m.f7389d);
        this.f5126f = oVar;
    }

    public d(W4.i iVar) {
        super(C1087a.f12498d);
        this.f5126f = iVar;
    }

    public d(C1429a c1429a) {
        super(C1461a.f14378d);
        this.f5126f = c1429a;
    }

    public d(P3.a aVar) {
        super(P3.h.f4512d);
        this.f5126f = aVar;
    }
}
