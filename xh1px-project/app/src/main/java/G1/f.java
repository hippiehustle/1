package G1;

import A1.o;
import K3.C0095i;
import L7.k0;
import Z5.y;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Space;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.buzbuz.smartautoclicker.R;
import com.buzbuz.smartautoclicker.core.ui.views.gesturerecord.GestureRecordView;
import com.buzbuz.smartautoclicker.core.ui.views.itembrief.ItemBriefView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textview.MaterialTextView;
import java.util.List;
import n6.InterfaceC1164c;
import o6.r;
import q4.X;

/* loaded from: classes.dex */
public abstract class f extends E1.c {

    /* renamed from: I, reason: collision with root package name */
    public final int f1706I;

    /* renamed from: J, reason: collision with root package name */
    public final int f1707J;
    public final j K;

    /* renamed from: L, reason: collision with root package name */
    public K2.d f1708L;

    /* renamed from: M, reason: collision with root package name */
    public K2.d f1709M;

    /* renamed from: N, reason: collision with root package name */
    public g f1710N;

    /* renamed from: O, reason: collision with root package name */
    public b f1711O;

    /* renamed from: P, reason: collision with root package name */
    public Animator f1712P;

    public f(int i4, int i8, Integer num) {
        super(num, true);
        this.f1706I = i4;
        this.f1707J = i8;
        this.K = new j();
    }

    @Override // E1.c
    public final View J() {
        g gVar;
        K2.b bVar;
        int i4;
        this.f1708L = new K2.d();
        this.f1709M = new K2.d();
        Object systemService = k().getSystemService((Class<Object>) LayoutInflater.class);
        o6.j.d(systemService, "getSystemService(...)");
        LayoutInflater layoutInflater = (LayoutInflater) systemService;
        int i8 = l().f7104e.f7095b;
        int i9 = R.id.card_action_index;
        int i10 = R.id.button_move_previous;
        int i11 = R.id.background_list;
        int i12 = R.id.background_instructions;
        if (i8 == 1) {
            View inflate = layoutInflater.inflate(R.layout.overlay_view_action_brief_port, (ViewGroup) null, false);
            if (E2.b.r(inflate, R.id.background_instructions) != null) {
                if (E2.b.r(inflate, R.id.background_list) != null) {
                    MaterialButton materialButton = (MaterialButton) E2.b.r(inflate, R.id.button_delete);
                    if (materialButton != null) {
                        MaterialButton materialButton2 = (MaterialButton) E2.b.r(inflate, R.id.button_move_next);
                        if (materialButton2 != null) {
                            MaterialButton materialButton3 = (MaterialButton) E2.b.r(inflate, R.id.button_move_previous);
                            if (materialButton3 != null) {
                                MaterialButton materialButton4 = (MaterialButton) E2.b.r(inflate, R.id.button_play_action);
                                if (materialButton4 != null) {
                                    if (((MaterialCardView) E2.b.r(inflate, R.id.card_action_index)) != null) {
                                        MaterialCardView materialCardView = (MaterialCardView) E2.b.r(inflate, R.id.empty_scenario_card);
                                        if (materialCardView != null) {
                                            ImageView imageView = (ImageView) E2.b.r(inflate, R.id.icon_recording);
                                            if (imageView != null) {
                                                ConstraintLayout constraintLayout = (ConstraintLayout) E2.b.r(inflate, R.id.layout_action_list);
                                                if (constraintLayout != null) {
                                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) E2.b.r(inflate, R.id.layout_instructions);
                                                    if (constraintLayout2 != null) {
                                                        RecyclerView recyclerView = (RecyclerView) E2.b.r(inflate, R.id.list_actions);
                                                        if (recyclerView != null) {
                                                            int i13 = R.id.space_background_top;
                                                            if (((Space) E2.b.r(inflate, R.id.space_background_top)) != null) {
                                                                i13 = R.id.space_end;
                                                                if (((Space) E2.b.r(inflate, R.id.space_end)) != null) {
                                                                    if (((Space) E2.b.r(inflate, R.id.space_instructions_background_bottom)) != null) {
                                                                        i13 = R.id.space_start;
                                                                        if (((Space) E2.b.r(inflate, R.id.space_start)) != null) {
                                                                            MaterialTextView materialTextView = (MaterialTextView) E2.b.r(inflate, R.id.text_action_index);
                                                                            if (materialTextView != null) {
                                                                                MaterialTextView materialTextView2 = (MaterialTextView) E2.b.r(inflate, R.id.text_empty_scenario);
                                                                                if (materialTextView2 != null) {
                                                                                    if (((MaterialTextView) E2.b.r(inflate, R.id.text_instructions)) != null) {
                                                                                        ItemBriefView itemBriefView = (ItemBriefView) E2.b.r(inflate, R.id.view_brief);
                                                                                        if (itemBriefView != null) {
                                                                                            GestureRecordView gestureRecordView = (GestureRecordView) E2.b.r(inflate, R.id.view_record);
                                                                                            if (gestureRecordView != null) {
                                                                                                FrameLayout frameLayout = (FrameLayout) inflate;
                                                                                                o6.j.d(frameLayout, "getRoot(...)");
                                                                                                gVar = new g(frameLayout, itemBriefView, gestureRecordView, constraintLayout2, imageView, constraintLayout, recyclerView, materialTextView, materialButton3, materialButton2, materialButton, materialButton4, materialCardView, materialTextView2);
                                                                                            } else {
                                                                                                i9 = R.id.view_record;
                                                                                            }
                                                                                        } else {
                                                                                            i9 = R.id.view_brief;
                                                                                        }
                                                                                    } else {
                                                                                        i9 = R.id.text_instructions;
                                                                                    }
                                                                                } else {
                                                                                    i9 = R.id.text_empty_scenario;
                                                                                }
                                                                            } else {
                                                                                i9 = R.id.text_action_index;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        i9 = R.id.space_instructions_background_bottom;
                                                                    }
                                                                }
                                                            }
                                                            i9 = i13;
                                                        } else {
                                                            i9 = R.id.list_actions;
                                                        }
                                                    } else {
                                                        i9 = R.id.layout_instructions;
                                                    }
                                                } else {
                                                    i9 = R.id.layout_action_list;
                                                }
                                            } else {
                                                i9 = R.id.icon_recording;
                                            }
                                        } else {
                                            i9 = R.id.empty_scenario_card;
                                        }
                                    }
                                } else {
                                    i9 = R.id.button_play_action;
                                }
                            } else {
                                i9 = R.id.button_move_previous;
                            }
                        } else {
                            i9 = R.id.button_move_next;
                        }
                    } else {
                        i9 = R.id.button_delete;
                    }
                } else {
                    i9 = R.id.background_list;
                }
            } else {
                i9 = R.id.background_instructions;
            }
            throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i9)));
        }
        View inflate2 = layoutInflater.inflate(R.layout.overlay_view_action_brief_land, (ViewGroup) null, false);
        if (E2.b.r(inflate2, R.id.background_instructions) != null) {
            if (E2.b.r(inflate2, R.id.background_list) != null) {
                MaterialButton materialButton5 = (MaterialButton) E2.b.r(inflate2, R.id.button_delete);
                if (materialButton5 != null) {
                    MaterialButton materialButton6 = (MaterialButton) E2.b.r(inflate2, R.id.button_move_next);
                    if (materialButton6 != null) {
                        MaterialButton materialButton7 = (MaterialButton) E2.b.r(inflate2, R.id.button_move_previous);
                        if (materialButton7 != null) {
                            MaterialButton materialButton8 = (MaterialButton) E2.b.r(inflate2, R.id.button_play_action);
                            if (materialButton8 != null) {
                                if (((MaterialCardView) E2.b.r(inflate2, R.id.card_action_index)) != null) {
                                    MaterialCardView materialCardView2 = (MaterialCardView) E2.b.r(inflate2, R.id.empty_scenario_card);
                                    if (materialCardView2 != null) {
                                        i9 = R.id.icon_recording;
                                        ImageView imageView2 = (ImageView) E2.b.r(inflate2, R.id.icon_recording);
                                        if (imageView2 != null) {
                                            i10 = R.id.layout_action_list;
                                            ConstraintLayout constraintLayout3 = (ConstraintLayout) E2.b.r(inflate2, R.id.layout_action_list);
                                            if (constraintLayout3 != null) {
                                                i11 = R.id.layout_instructions;
                                                ConstraintLayout constraintLayout4 = (ConstraintLayout) E2.b.r(inflate2, R.id.layout_instructions);
                                                if (constraintLayout4 != null) {
                                                    i12 = R.id.list_actions;
                                                    RecyclerView recyclerView2 = (RecyclerView) E2.b.r(inflate2, R.id.list_actions);
                                                    if (recyclerView2 != null) {
                                                        i11 = R.id.space_background_end;
                                                        if (((Space) E2.b.r(inflate2, R.id.space_background_end)) != null) {
                                                            i12 = R.id.space_instructions_background_bottom;
                                                            if (((Space) E2.b.r(inflate2, R.id.space_instructions_background_bottom)) != null) {
                                                                i11 = R.id.text_action_index;
                                                                MaterialTextView materialTextView3 = (MaterialTextView) E2.b.r(inflate2, R.id.text_action_index);
                                                                if (materialTextView3 != null) {
                                                                    i12 = R.id.text_empty_scenario;
                                                                    MaterialTextView materialTextView4 = (MaterialTextView) E2.b.r(inflate2, R.id.text_empty_scenario);
                                                                    if (materialTextView4 != null) {
                                                                        i11 = R.id.text_instructions;
                                                                        if (((MaterialTextView) E2.b.r(inflate2, R.id.text_instructions)) != null) {
                                                                            i12 = R.id.view_brief;
                                                                            ItemBriefView itemBriefView2 = (ItemBriefView) E2.b.r(inflate2, R.id.view_brief);
                                                                            if (itemBriefView2 != null) {
                                                                                i11 = R.id.view_record;
                                                                                GestureRecordView gestureRecordView2 = (GestureRecordView) E2.b.r(inflate2, R.id.view_record);
                                                                                if (gestureRecordView2 != null) {
                                                                                    FrameLayout frameLayout2 = (FrameLayout) inflate2;
                                                                                    o6.j.d(frameLayout2, "getRoot(...)");
                                                                                    gVar = new g(frameLayout2, itemBriefView2, gestureRecordView2, constraintLayout4, imageView2, constraintLayout3, recyclerView2, materialTextView3, materialButton7, materialButton6, materialButton5, materialButton8, materialCardView2, materialTextView4);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        i9 = R.id.empty_scenario_card;
                                    }
                                }
                            } else {
                                i9 = R.id.button_play_action;
                            }
                        }
                        i9 = i10;
                    } else {
                        i9 = R.id.button_move_next;
                    }
                } else {
                    i9 = R.id.button_delete;
                }
                throw new NullPointerException("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i9)));
            }
            i9 = i11;
            throw new NullPointerException("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i9)));
        }
        i9 = i12;
        throw new NullPointerException("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i9)));
        this.f1710N = gVar;
        this.f1711O = new b(l(), new o(2, this, f.class, "onCreateBriefItemViewHolder", "onCreateBriefItemViewHolder(Landroid/view/ViewGroup;I)Lcom/buzbuz/smartautoclicker/core/common/overlays/menu/implementation/brief/ItemBriefViewHolder;", 0, 0, 3), new o(2, this, f.class, "onBriefItemViewBound", "onBriefItemViewBound(ILandroid/view/View;)V", 0, 0, 4), new C1.b(1, this));
        g S8 = S();
        RecyclerView recyclerView3 = S8.f1719g;
        K2.d dVar = this.f1708L;
        if (dVar != null) {
            ConstraintLayout constraintLayout5 = S8.f1718f;
            if (l().f7104e.f7095b == 1) {
                bVar = K2.b.f2602h;
            } else {
                bVar = K2.b.f2600f;
            }
            dVar.a(constraintLayout5, bVar);
            K2.d dVar2 = this.f1709M;
            if (dVar2 != null) {
                dVar2.a(S8.f1716d, K2.b.f2601g);
                Animator loadAnimator = AnimatorInflater.loadAnimator(k(), R.animator.blinking);
                o6.j.d(loadAnimator, "loadAnimator(...)");
                this.f1712P = loadAnimator;
                b bVar2 = this.f1711O;
                if (bVar2 != null) {
                    recyclerView3.setAdapter(bVar2);
                    d dVar3 = new d(this, 0);
                    j jVar = this.K;
                    jVar.j = dVar3;
                    jVar.a(recyclerView3);
                    jVar.f1732h = Integer.valueOf(this.f1707J);
                    k();
                    if (l().f7104e.f7095b == 1) {
                        i4 = 0;
                    } else {
                        i4 = 1;
                    }
                    recyclerView3.setLayoutManager(new LinearLayoutManager(i4));
                    S8.f1724n.setText(this.f1706I);
                    S8.f1713a.setOnClickListener(new B2.b(7, this));
                    A(S8.f1722l, new d(this, 1));
                    A(S8.k, new d(this, 2));
                    A(S8.f1721i, new d(this, 3));
                    A(S8.j, new d(this, 4));
                    A(S8.f1720h, new d(this, 5));
                    X(0);
                    S();
                    return S().f1713a;
                }
                o6.j.i("briefAdapter");
                throw null;
            }
            o6.j.i("instructionsAnimationController");
            throw null;
        }
        o6.j.i("briefPanelAnimationController");
        throw null;
    }

    @Override // E1.c
    public void M(boolean z8) {
        if (z8) {
            K2.d dVar = this.f1708L;
            if (dVar != null) {
                dVar.e();
            } else {
                o6.j.i("briefPanelAnimationController");
                throw null;
            }
        }
    }

    public final g S() {
        g gVar = this.f1710N;
        if (gVar != null) {
            return gVar;
        }
        o6.j.i("briefViewBinding");
        throw null;
    }

    public final boolean T() {
        if (S().f1715c.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public abstract C0095i V(ViewGroup viewGroup, int i4);

    public abstract void W(int i4);

    public void X(int i4) {
        b bVar = this.f1711O;
        if (bVar != null) {
            f0(bVar.a());
        } else {
            o6.j.i("briefAdapter");
            throw null;
        }
    }

    public abstract void Y(a aVar);

    public abstract void Z(int i4, int i8);

    public abstract void a0(int i4, int i8);

    public abstract void b0(int i4);

    public final void c0(boolean z8) {
        ConstraintLayout constraintLayout;
        K2.d dVar = this.f1708L;
        if (dVar != null) {
            if (z8 != dVar.f2610c) {
                dVar.f2610c = z8;
                if (!z8) {
                    k0 k0Var = dVar.f2612e;
                    if (k0Var != null) {
                        k0Var.d(null);
                    }
                    dVar.f2612e = null;
                    ConstraintLayout constraintLayout2 = dVar.f2613f;
                    if (constraintLayout2 != null && constraintLayout2.getVisibility() == 8 && (constraintLayout = dVar.f2613f) != null) {
                        Animation animation = dVar.f2609b;
                        if (animation != null) {
                            constraintLayout.startAnimation(animation);
                            return;
                        } else {
                            o6.j.i("hideAnimation");
                            throw null;
                        }
                    }
                    return;
                }
                ConstraintLayout constraintLayout3 = dVar.f2613f;
                if (constraintLayout3 != null && constraintLayout3.getVisibility() == 0) {
                    dVar.d();
                    return;
                }
                return;
            }
            return;
        }
        o6.j.i("briefPanelAnimationController");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [o6.r, java.lang.Object] */
    public final void d0(final InterfaceC1164c interfaceC1164c) {
        K2.d dVar = this.f1708L;
        if (dVar != null) {
            dVar.c();
            Animator animator = this.f1712P;
            if (animator != null) {
                animator.setTarget(S().f1717e);
                Animator animator2 = this.f1712P;
                if (animator2 != null) {
                    animator2.start();
                    K2.d dVar2 = this.f1709M;
                    if (dVar2 != null) {
                        dVar2.e();
                        ItemBriefView itemBriefView = S().f1714b;
                        int i4 = ItemBriefView.f9790i;
                        itemBriefView.a(null, true);
                        GestureRecordView gestureRecordView = S().f1715c;
                        gestureRecordView.setVisibility(0);
                        final ?? obj = new Object();
                        gestureRecordView.setGestureCaptureListener(new InterfaceC1164c() { // from class: G1.e
                            @Override // n6.InterfaceC1164c
                            public final Object l(Object obj2, Object obj3) {
                                P2.a aVar;
                                O2.c cVar = (O2.c) obj2;
                                boolean booleanValue = ((Boolean) obj3).booleanValue();
                                f fVar = this;
                                P2.a aVar2 = null;
                                if (cVar != null) {
                                    r rVar = r.this;
                                    if (!rVar.f13639d) {
                                        rVar.f13639d = true;
                                        K2.d dVar3 = fVar.f1709M;
                                        if (dVar3 != null) {
                                            dVar3.c();
                                        } else {
                                            o6.j.i("instructionsAnimationController");
                                            throw null;
                                        }
                                    }
                                }
                                ItemBriefView itemBriefView2 = fVar.S().f1714b;
                                if (cVar != null) {
                                    aVar = X.a0(cVar);
                                } else {
                                    aVar = null;
                                }
                                itemBriefView2.a(aVar, booleanValue);
                                if (booleanValue) {
                                    fVar.e0();
                                    if (cVar != null) {
                                        aVar2 = X.a0(cVar);
                                    }
                                    interfaceC1164c.l(aVar2, Boolean.TRUE);
                                }
                                return y.f7506a;
                            }
                        });
                        return;
                    }
                    o6.j.i("instructionsAnimationController");
                    throw null;
                }
                o6.j.i("blinkingAnimator");
                throw null;
            }
            o6.j.i("blinkingAnimator");
            throw null;
        }
        o6.j.i("briefPanelAnimationController");
        throw null;
    }

    public final void e0() {
        Animator animator = this.f1712P;
        if (animator != null) {
            animator.end();
            GestureRecordView gestureRecordView = S().f1715c;
            gestureRecordView.setVisibility(8);
            gestureRecordView.f9787e.f89f = null;
            K2.d dVar = this.f1708L;
            if (dVar != null) {
                dVar.e();
                K2.d dVar2 = this.f1709M;
                if (dVar2 != null) {
                    dVar2.c();
                    return;
                } else {
                    o6.j.i("instructionsAnimationController");
                    throw null;
                }
            }
            o6.j.i("briefPanelAnimationController");
            throw null;
        }
        o6.j.i("blinkingAnimator");
        throw null;
    }

    public final void f0(int i4) {
        boolean z8;
        boolean z9 = false;
        g S8 = S();
        MaterialButton materialButton = S8.k;
        MaterialButton materialButton2 = S8.f1722l;
        MaterialButton materialButton3 = S8.j;
        MaterialButton materialButton4 = S8.f1721i;
        MaterialTextView materialTextView = S8.f1720h;
        j jVar = this.K;
        int i8 = jVar.k;
        if (i4 == 0) {
            materialButton4.setEnabled(false);
            materialButton3.setEnabled(false);
            materialButton2.setEnabled(false);
            materialButton.setEnabled(false);
            materialTextView.setText(k().getString(R.string.item_brief_items_count, 0, 0));
            materialTextView.setEnabled(false);
            return;
        }
        if (i8 != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        materialButton4.setEnabled(z8);
        if (jVar.k != i4 - 1) {
            z9 = true;
        }
        materialButton3.setEnabled(z9);
        materialButton2.setEnabled(true);
        materialButton.setEnabled(true);
        materialTextView.setText(k().getString(R.string.item_brief_items_count, Integer.valueOf(i8 + 1), Integer.valueOf(i4)));
        materialTextView.setEnabled(true);
    }

    public final void g0(List list) {
        o6.j.e(list, "actions");
        g S8 = S();
        MaterialCardView materialCardView = S8.f1723m;
        RecyclerView recyclerView = S8.f1719g;
        if (list.isEmpty()) {
            recyclerView.setVisibility(8);
            materialCardView.setVisibility(0);
        } else {
            recyclerView.setVisibility(0);
            materialCardView.setVisibility(8);
        }
        b bVar = this.f1711O;
        if (bVar != null) {
            bVar.h(list);
            f0(list.size());
        } else {
            o6.j.i("briefAdapter");
            throw null;
        }
    }

    @Override // w1.e
    public final void q() {
        K2.d dVar = this.f1708L;
        if (dVar != null) {
            dVar.b();
            K2.d dVar2 = this.f1709M;
            if (dVar2 != null) {
                dVar2.b();
                return;
            } else {
                o6.j.i("instructionsAnimationController");
                throw null;
            }
        }
        o6.j.i("briefPanelAnimationController");
        throw null;
    }

    @Override // w1.e
    public final void u() {
        K2.d dVar = this.f1708L;
        if (dVar != null) {
            dVar.e();
        } else {
            o6.j.i("briefPanelAnimationController");
            throw null;
        }
    }

    public void U(View view, int i4) {
    }
}
