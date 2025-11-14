package S;

import P.C0254b;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;

/* loaded from: classes.dex */
public final class e extends C0254b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5167d;

    public /* synthetic */ e(int i4) {
        this.f5167d = i4;
    }

    @Override // P.C0254b
    public void c(View view, AccessibilityEvent accessibilityEvent) {
        boolean z8;
        switch (this.f5167d) {
            case 0:
                super.c(view, accessibilityEvent);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                accessibilityEvent.setClassName(ScrollView.class.getName());
                if (nestedScrollView.getScrollRange() > 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                accessibilityEvent.setScrollable(z8);
                accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
                accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
                accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
                accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
                return;
            default:
                super.c(view, accessibilityEvent);
                return;
        }
    }

    @Override // P.C0254b
    public final void d(View view, Q.g gVar) {
        int scrollRange;
        switch (this.f5167d) {
            case 0:
                this.f4246a.onInitializeAccessibilityNodeInfo(view, gVar.f4709a);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                gVar.i(ScrollView.class.getName());
                if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                    gVar.l(true);
                    if (nestedScrollView.getScrollY() > 0) {
                        gVar.b(Q.f.f4697g);
                        gVar.b(Q.f.f4700l);
                    }
                    if (nestedScrollView.getScrollY() < scrollRange) {
                        gVar.b(Q.f.f4696f);
                        gVar.b(Q.f.f4701m);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                AccessibilityNodeInfo accessibilityNodeInfo = gVar.f4709a;
                this.f4246a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                accessibilityNodeInfo.setCollectionInfo(null);
                return;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                this.f4246a.onInitializeAccessibilityNodeInfo(view, gVar.f4709a);
                gVar.l(false);
                return;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo2 = gVar.f4709a;
                this.f4246a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                accessibilityNodeInfo2.setCollectionInfo(null);
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
    
        if (r6 != 16908346) goto L32;
     */
    @Override // P.C0254b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean g(View view, int i4, Bundle bundle) {
        switch (this.f5167d) {
            case 0:
                if (super.g(view, i4, bundle)) {
                    return true;
                }
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                if (nestedScrollView.isEnabled()) {
                    int height = nestedScrollView.getHeight();
                    Rect rect = new Rect();
                    if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                        height = rect.height();
                    }
                    if (i4 != 4096) {
                        if (i4 != 8192 && i4 != 16908344) {
                            break;
                        } else {
                            int max = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                            if (max != nestedScrollView.getScrollY()) {
                                nestedScrollView.u(0 - nestedScrollView.getScrollX(), max - nestedScrollView.getScrollY(), true);
                                return true;
                            }
                        }
                    }
                    int min = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
                    if (min != nestedScrollView.getScrollY()) {
                        nestedScrollView.u(0 - nestedScrollView.getScrollX(), min - nestedScrollView.getScrollY(), true);
                        return true;
                    }
                }
                return false;
            default:
                return super.g(view, i4, bundle);
        }
    }
}
