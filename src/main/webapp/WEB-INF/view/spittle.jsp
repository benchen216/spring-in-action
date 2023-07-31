<c:forEach items="${spittleList}" var="spittle">
    <li id="spittle-${spittle.id}">
    <div class="spitter-message">
    <c:out value="${spittle.message}" />
    </div>
        <span class="spittle-time">${spittle.time}</span>
        <span class="spittle-location" title="${spittle.location}">${spittle.location}</span>
    </li>
</c:forEach>