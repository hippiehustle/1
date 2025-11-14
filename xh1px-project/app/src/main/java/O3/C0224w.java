package O3;

import a.AbstractC0405a;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.buzbuz.smartautoclicker.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.divider.MaterialDivider;
import com.google.android.material.textview.MaterialTextView;
import kotlin.NoWhenBranchMatchedException;
import n6.InterfaceC1163b;
import o.p1;
import t0.s0;

/* renamed from: O3.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0224w extends t0.L {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3999e = 1;

    /* renamed from: f, reason: collision with root package name */
    public final Z5.d f4000f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC1163b f4001g;

    public C0224w(A1.o oVar, A1.e eVar) {
        super(E4.b.f1198f);
        this.f4000f = oVar;
        this.f4001g = eVar;
    }

    @Override // t0.U
    public final int c(int i4) {
        switch (this.f3999e) {
            case 0:
                AbstractC0223v abstractC0223v = (AbstractC0223v) g(i4);
                if (abstractC0223v instanceof C0221t) {
                    return R.layout.item_new_copy_card;
                }
                if (abstractC0223v instanceof C0222u) {
                    return R.layout.item_intent_extra_card;
                }
                throw new NoWhenBranchMatchedException();
            default:
                E4.j jVar = (E4.j) g(i4);
                if (jVar instanceof E4.i) {
                    return R.layout.item_debug_report_scenario;
                }
                if (jVar instanceof E4.h) {
                    return R.layout.item_debug_report_event;
                }
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // t0.U
    public final void d(s0 s0Var, int i4) {
        switch (this.f3999e) {
            case 0:
                if (s0Var instanceof C0220s) {
                    C0220s c0220s = (C0220s) s0Var;
                    Object g8 = g(i4);
                    o6.j.c(g8, "null cannot be cast to non-null type com.buzbuz.smartautoclicker.feature.smart.config.ui.action.intent.ExtraListItem.ExtraItem");
                    C0222u c0222u = (C0222u) g8;
                    A4.c cVar = c0220s.f3993u;
                    ((TextView) cVar.f292f).setText(c0222u.f3997b);
                    ((TextView) cVar.f293g).setText(c0222u.f3998c);
                    ((MaterialCardView) cVar.f291e).setOnClickListener(new D2.a(c0220s, 4, c0222u));
                    return;
                }
                return;
            default:
                if (s0Var instanceof E4.p) {
                    Object g9 = g(i4);
                    o6.j.c(g9, "null cannot be cast to non-null type com.buzbuz.smartautoclicker.feature.smart.debugging.ui.report.DebugReportItem.ScenarioReportItem");
                    E4.i iVar = (E4.i) g9;
                    p1 p1Var = ((E4.p) s0Var).f1244u;
                    ((MaterialTextView) p1Var.k).setText(iVar.f1227b);
                    AbstractC0405a.v0((A4.c) p1Var.j, R.string.item_title_report_total_duration, iVar.f1228c);
                    AbstractC0405a.v0((A4.c) p1Var.f13353i, R.string.item_title_report_image_processed, iVar.f1229d);
                    AbstractC0405a.v0((A4.c) p1Var.f13350f, R.string.item_title_report_avg_image_processing_duration, iVar.f1230e);
                    AbstractC0405a.v0((A4.c) p1Var.f13352h, R.string.item_title_report_total_event_trigger_count, iVar.f1231f);
                    AbstractC0405a.v0((A4.c) p1Var.f13351g, R.string.item_title_report_detection_count, iVar.f1232g);
                    return;
                }
                if (s0Var instanceof E4.o) {
                    E4.o oVar = (E4.o) s0Var;
                    Object g10 = g(i4);
                    o6.j.c(g10, "null cannot be cast to non-null type com.buzbuz.smartautoclicker.feature.smart.debugging.ui.report.DebugReportItem.EventReportItem");
                    E4.h hVar = (E4.h) g10;
                    A4.d dVar = oVar.f1242u;
                    ((MaterialTextView) dVar.f298h).setText(hVar.f1219b);
                    AbstractC0405a.x0((A4.b) dVar.f299i, R.string.section_title_report_event_trigger_count, hVar.f1220c, R.string.section_title_report_event_processing_count, hVar.f1221d);
                    AbstractC0405a.y0((A4.b) dVar.f297g, R.string.section_title_report_timing_title, hVar.f1223f, hVar.f1222e, hVar.f1224g);
                    oVar.f1243v.h(hVar.f1225h);
                    return;
                }
                return;
        }
    }

    @Override // t0.U
    public final s0 e(ViewGroup viewGroup, int i4) {
        s0 c0220s;
        s0 oVar;
        switch (this.f3999e) {
            case 0:
                if (i4 == R.layout.item_new_copy_card) {
                    View h8 = A.j.h(viewGroup, R.layout.item_new_copy_card, viewGroup, false);
                    int i8 = R.id.copy_item;
                    MaterialButton materialButton = (MaterialButton) E2.b.r(h8, R.id.copy_item);
                    if (materialButton != null) {
                        i8 = R.id.new_item;
                        MaterialButton materialButton2 = (MaterialButton) E2.b.r(h8, R.id.new_item);
                        if (materialButton2 != null) {
                            C0204b c0204b = (C0204b) this.f4000f;
                            o6.j.e(c0204b, "addActionClickedListener");
                            c0220s = new s0((MaterialCardView) h8);
                            materialButton2.setOnClickListener(new E2.a(3, c0204b));
                            materialButton.setVisibility(8);
                        }
                    }
                    throw new NullPointerException("Missing required view with ID: ".concat(h8.getResources().getResourceName(i8)));
                }
                if (i4 == R.layout.item_intent_extra_card) {
                    View h9 = A.j.h(viewGroup, R.layout.item_intent_extra_card, viewGroup, false);
                    int i9 = R.id.separator;
                    if (((MaterialDivider) E2.b.r(h9, R.id.separator)) != null) {
                        i9 = R.id.text_extra_name;
                        TextView textView = (TextView) E2.b.r(h9, R.id.text_extra_name);
                        if (textView != null) {
                            i9 = R.id.text_extra_value;
                            TextView textView2 = (TextView) E2.b.r(h9, R.id.text_extra_value);
                            if (textView2 != null) {
                                c0220s = new C0220s(new A4.c((MaterialCardView) h9, textView, textView2, 9), (C0205c) this.f4001g);
                            }
                        }
                    }
                    throw new NullPointerException("Missing required view with ID: ".concat(h9.getResources().getResourceName(i9)));
                }
                throw new IllegalArgumentException("Unsupported view type !");
                return c0220s;
            default:
                if (i4 == R.layout.item_debug_report_scenario) {
                    View h10 = A.j.h(viewGroup, R.layout.item_debug_report_scenario, viewGroup, false);
                    int i10 = R.id.root_avg_img_proc_dur;
                    View r8 = E2.b.r(h10, R.id.root_avg_img_proc_dur);
                    if (r8 != null) {
                        A4.c a3 = A4.c.a(r8);
                        i10 = R.id.root_cond_trigger_count;
                        View r9 = E2.b.r(h10, R.id.root_cond_trigger_count);
                        if (r9 != null) {
                            A4.c a4 = A4.c.a(r9);
                            i10 = R.id.root_evt_trigger_count;
                            View r10 = E2.b.r(h10, R.id.root_evt_trigger_count);
                            if (r10 != null) {
                                A4.c a9 = A4.c.a(r10);
                                i10 = R.id.root_img_proc_count;
                                View r11 = E2.b.r(h10, R.id.root_img_proc_count);
                                if (r11 != null) {
                                    A4.c a10 = A4.c.a(r11);
                                    i10 = R.id.root_total_duration;
                                    View r12 = E2.b.r(h10, R.id.root_total_duration);
                                    if (r12 != null) {
                                        A4.c a11 = A4.c.a(r12);
                                        i10 = R.id.text_scenario_name;
                                        MaterialTextView materialTextView = (MaterialTextView) E2.b.r(h10, R.id.text_scenario_name);
                                        if (materialTextView != null) {
                                            oVar = new E4.p(new p1((MaterialCardView) h10, a3, a4, a9, a10, a11, materialTextView, 1));
                                        }
                                    }
                                }
                            }
                        }
                    }
                    throw new NullPointerException("Missing required view with ID: ".concat(h10.getResources().getResourceName(i10)));
                }
                if (i4 == R.layout.item_debug_report_event) {
                    View h11 = A.j.h(viewGroup, R.layout.item_debug_report_event, viewGroup, false);
                    int i11 = R.id.list_conditions;
                    RecyclerView recyclerView = (RecyclerView) E2.b.r(h11, R.id.list_conditions);
                    if (recyclerView != null) {
                        i11 = R.id.processing_timing_root;
                        View r13 = E2.b.r(h11, R.id.processing_timing_root);
                        if (r13 != null) {
                            A4.b a12 = A4.b.a(r13);
                            i11 = R.id.text_event_name;
                            MaterialTextView materialTextView2 = (MaterialTextView) E2.b.r(h11, R.id.text_event_name);
                            if (materialTextView2 != null) {
                                i11 = R.id.trigger_count_root;
                                View r14 = E2.b.r(h11, R.id.trigger_count_root);
                                if (r14 != null) {
                                    oVar = new E4.o(new A4.d((MaterialCardView) h11, recyclerView, a12, materialTextView2, A4.b.b(r14), 0), (A1.o) this.f4000f, (A1.e) this.f4001g);
                                }
                            }
                        }
                    }
                    throw new NullPointerException("Missing required view with ID: ".concat(h11.getResources().getResourceName(i11)));
                }
                throw new IllegalArgumentException("Unsupported view type !");
                return oVar;
        }
    }

    public C0224w(C0204b c0204b, C0205c c0205c) {
        super(r.f3992d);
        this.f4000f = c0204b;
        this.f4001g = c0205c;
    }
}
