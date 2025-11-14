package g0;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.buzbuz.smartautoclicker.R;
import s3.AbstractC1492c;

/* renamed from: g0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0738g extends D6.b {

    /* renamed from: f, reason: collision with root package name */
    public final boolean f11019f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f11020g;

    /* renamed from: h, reason: collision with root package name */
    public R3.r f11021h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0738g(g0 g0Var, boolean z8) {
        super(g0Var);
        o6.j.e(g0Var, "operation");
        this.f11019f = z8;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0063 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final R3.r K0(Context context) {
        boolean z8;
        int i4;
        int i8;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        Animation loadAnimation;
        R3.r rVar;
        int i9;
        if (this.f11020g) {
            return this.f11021h;
        }
        g0 g0Var = (g0) this.f1023e;
        AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y = g0Var.f11024c;
        if (g0Var.f11022a == 2) {
            z8 = true;
        } else {
            z8 = false;
        }
        C0753w c0753w = abstractComponentCallbacksC0755y.f11097N;
        if (c0753w == null) {
            i4 = 0;
        } else {
            i4 = c0753w.f11080f;
        }
        if (this.f11019f) {
            if (z8) {
                if (c0753w != null) {
                    i8 = c0753w.f11078d;
                    abstractComponentCallbacksC0755y.Q(0, 0, 0, 0);
                    viewGroup = abstractComponentCallbacksC0755y.f11094J;
                    R3.r rVar2 = null;
                    if (viewGroup != null && viewGroup.getTag(R.id.visible_removing_fragment_view_tag) != null) {
                        abstractComponentCallbacksC0755y.f11094J.setTag(R.id.visible_removing_fragment_view_tag, null);
                    }
                    viewGroup2 = abstractComponentCallbacksC0755y.f11094J;
                    if (viewGroup2 != null || viewGroup2.getLayoutTransition() == null) {
                        if (i8 == 0 && i4 != 0) {
                            if (i4 == 4097) {
                                if (i4 != 8194) {
                                    if (i4 != 8197) {
                                        if (i4 != 4099) {
                                            if (i4 != 4100) {
                                                i9 = -1;
                                            } else if (z8) {
                                                i9 = AbstractC1492c.I(context, android.R.attr.activityOpenEnterAnimation);
                                            } else {
                                                i9 = AbstractC1492c.I(context, android.R.attr.activityOpenExitAnimation);
                                            }
                                        } else if (z8) {
                                            i9 = R.animator.fragment_fade_enter;
                                        } else {
                                            i9 = R.animator.fragment_fade_exit;
                                        }
                                    } else if (z8) {
                                        i9 = AbstractC1492c.I(context, android.R.attr.activityCloseEnterAnimation);
                                    } else {
                                        i9 = AbstractC1492c.I(context, android.R.attr.activityCloseExitAnimation);
                                    }
                                } else if (z8) {
                                    i9 = R.animator.fragment_close_enter;
                                } else {
                                    i9 = R.animator.fragment_close_exit;
                                }
                            } else if (z8) {
                                i9 = R.animator.fragment_open_enter;
                            } else {
                                i9 = R.animator.fragment_open_exit;
                            }
                            i8 = i9;
                        }
                        if (i8 != 0) {
                            boolean equals = "anim".equals(context.getResources().getResourceTypeName(i8));
                            try {
                                if (equals) {
                                    try {
                                        loadAnimation = AnimationUtils.loadAnimation(context, i8);
                                    } catch (Resources.NotFoundException e9) {
                                        throw e9;
                                    } catch (RuntimeException unused) {
                                    }
                                    if (loadAnimation != null) {
                                        rVar = new R3.r(loadAnimation);
                                        rVar2 = rVar;
                                    }
                                }
                                Animator loadAnimator = AnimatorInflater.loadAnimator(context, i8);
                                if (loadAnimator != null) {
                                    rVar = new R3.r(loadAnimator);
                                    rVar2 = rVar;
                                }
                            } catch (RuntimeException e10) {
                                if (!equals) {
                                    Animation loadAnimation2 = AnimationUtils.loadAnimation(context, i8);
                                    if (loadAnimation2 != null) {
                                        rVar2 = new R3.r(loadAnimation2);
                                    }
                                } else {
                                    throw e10;
                                }
                            }
                        }
                    }
                    this.f11021h = rVar2;
                    this.f11020g = true;
                    return rVar2;
                }
                i8 = 0;
                abstractComponentCallbacksC0755y.Q(0, 0, 0, 0);
                viewGroup = abstractComponentCallbacksC0755y.f11094J;
                R3.r rVar22 = null;
                if (viewGroup != null) {
                    abstractComponentCallbacksC0755y.f11094J.setTag(R.id.visible_removing_fragment_view_tag, null);
                }
                viewGroup2 = abstractComponentCallbacksC0755y.f11094J;
                if (viewGroup2 != null) {
                }
                if (i8 == 0) {
                    if (i4 == 4097) {
                    }
                    i8 = i9;
                }
                if (i8 != 0) {
                }
                this.f11021h = rVar22;
                this.f11020g = true;
                return rVar22;
            }
            if (c0753w != null) {
                i8 = c0753w.f11079e;
                abstractComponentCallbacksC0755y.Q(0, 0, 0, 0);
                viewGroup = abstractComponentCallbacksC0755y.f11094J;
                R3.r rVar222 = null;
                if (viewGroup != null) {
                }
                viewGroup2 = abstractComponentCallbacksC0755y.f11094J;
                if (viewGroup2 != null) {
                }
                if (i8 == 0) {
                }
                if (i8 != 0) {
                }
                this.f11021h = rVar222;
                this.f11020g = true;
                return rVar222;
            }
            i8 = 0;
            abstractComponentCallbacksC0755y.Q(0, 0, 0, 0);
            viewGroup = abstractComponentCallbacksC0755y.f11094J;
            R3.r rVar2222 = null;
            if (viewGroup != null) {
            }
            viewGroup2 = abstractComponentCallbacksC0755y.f11094J;
            if (viewGroup2 != null) {
            }
            if (i8 == 0) {
            }
            if (i8 != 0) {
            }
            this.f11021h = rVar2222;
            this.f11020g = true;
            return rVar2222;
        }
        if (z8) {
            if (c0753w != null) {
                i8 = c0753w.f11076b;
                abstractComponentCallbacksC0755y.Q(0, 0, 0, 0);
                viewGroup = abstractComponentCallbacksC0755y.f11094J;
                R3.r rVar22222 = null;
                if (viewGroup != null) {
                }
                viewGroup2 = abstractComponentCallbacksC0755y.f11094J;
                if (viewGroup2 != null) {
                }
                if (i8 == 0) {
                }
                if (i8 != 0) {
                }
                this.f11021h = rVar22222;
                this.f11020g = true;
                return rVar22222;
            }
            i8 = 0;
            abstractComponentCallbacksC0755y.Q(0, 0, 0, 0);
            viewGroup = abstractComponentCallbacksC0755y.f11094J;
            R3.r rVar222222 = null;
            if (viewGroup != null) {
            }
            viewGroup2 = abstractComponentCallbacksC0755y.f11094J;
            if (viewGroup2 != null) {
            }
            if (i8 == 0) {
            }
            if (i8 != 0) {
            }
            this.f11021h = rVar222222;
            this.f11020g = true;
            return rVar222222;
        }
        if (c0753w != null) {
            i8 = c0753w.f11077c;
            abstractComponentCallbacksC0755y.Q(0, 0, 0, 0);
            viewGroup = abstractComponentCallbacksC0755y.f11094J;
            R3.r rVar2222222 = null;
            if (viewGroup != null) {
            }
            viewGroup2 = abstractComponentCallbacksC0755y.f11094J;
            if (viewGroup2 != null) {
            }
            if (i8 == 0) {
            }
            if (i8 != 0) {
            }
            this.f11021h = rVar2222222;
            this.f11020g = true;
            return rVar2222222;
        }
        i8 = 0;
        abstractComponentCallbacksC0755y.Q(0, 0, 0, 0);
        viewGroup = abstractComponentCallbacksC0755y.f11094J;
        R3.r rVar22222222 = null;
        if (viewGroup != null) {
        }
        viewGroup2 = abstractComponentCallbacksC0755y.f11094J;
        if (viewGroup2 != null) {
        }
        if (i8 == 0) {
        }
        if (i8 != 0) {
        }
        this.f11021h = rVar22222222;
        this.f11020g = true;
        return rVar22222222;
    }
}
