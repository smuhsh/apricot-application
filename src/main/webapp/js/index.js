function mymodalclick() { //모달 클릭시
  let modal = document.querySelector('.my-modal');
  modal.style.display = (modal.style.display === 'flex') ? 'none' : 'flex';

  let triangle = document.querySelector('.triangle');
  triangle.style.display = (triangle.style.display === 'flex') ? 'none'
      : 'flex';

}

function gotoMyPage() { //마이페이지 버튼 클릭시
  location.href = "/mypage";
}

function gotoHome() { //홉 로고 클릭시
  location.href = "/";
}

document.addEventListener('DOMContentLoaded', function() {
  const searchButton = document.querySelector('.search-btn');
  const searchInput = document.getElementById('search-id');

});
